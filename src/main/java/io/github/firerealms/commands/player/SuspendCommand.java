package io.github.firerealms.commands.player;

import io.github.firerealms.configs.Lang;
import io.github.firerealms.managers.UtilManager;
import io.github.firerealms.utils.Helper;
import io.github.firerealms.utils.Logger;
import io.github.firerealms.utils.Time;
import lombok.Getter;
import net.luckperms.api.model.data.DataMutateResult;
import net.luckperms.api.node.types.InheritanceNode;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.concurrent.TimeUnit;

@SuppressWarnings("deprecation")
@Getter
public class SuspendCommand implements CommandExecutor {
  private final Helper helper;
  private final Logger logger;

  public SuspendCommand(final UtilManager utilManager) {
    this.helper = utilManager.getHelper();
    this.logger = utilManager.getLogger();
  }

  @Override
  public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
    if (!sender.hasPermission("leaguemanager.command.suspend")) {
      getLogger().send(sender, Lang.INSUFFICIENT_PERMISSION.getConfigValue(null));
    } else {
      if (args.length <= 1 || args[1].equalsIgnoreCase("help")) {
        getLogger().send(sender, Lang.USER_HELP.getConfigValue(null));
      } else if (args.length >= 3) {
        final OfflinePlayer target = Bukkit.getOfflinePlayer(args[1]);
        Time time;

        try {
          time = Time.parseString(args[2]);
        } catch (Time.TimeParseException | NullPointerException e) {
          getLogger().send(sender, Lang.INVALID_TIME.getConfigValue(null));
          return true;
        }

        if (target == null || !target.hasPlayedBefore()) {
          getLogger().send(sender, Lang.USER_NOT_FOUND.getConfigValue(null));
          return true;
        }

        if (args[1].equalsIgnoreCase(target.getName())) {
          final InheritanceNode group = InheritanceNode.builder("suspend").expiry(time.toMilliseconds(), TimeUnit.MILLISECONDS).build();

          getHelper().getUserManager().modifyUser(target.getUniqueId(), user -> {
            final DataMutateResult result = user.data().add(group);

            if (result.wasSuccessful()) {
              if (args.length == 3) {
                getLogger().send(sender, Lang.USER_SUSPEND.getConfigValue(new String[] { target.getName(), time.toString(), "Rule Breaking" }));
                if (target.isOnline())
                  getLogger().send(target.getPlayer(), Lang.USER_SUSPENDED.getConfigValue(new String[] { time.toString(), "Rule Breaking" }));
              } else {
                final String reason = StringUtils.join(args, ' ', 3, args.length);
                getLogger().send(sender, Lang.USER_SUSPEND.getConfigValue(new String[] { target.getName(), time.toString(), reason }));
                if (target.isOnline())
                  getLogger().send(target.getPlayer(), Lang.USER_SUSPENDED.getConfigValue(new String[] { time.toString(), reason }));
              }
            } else
              getLogger().send(sender, Lang.USER_ALREADY_SUSPENDED.getConfigValue(new String[] { target.getName() }));
          });
        } else getLogger().send(sender, Lang.USER_USAGE_SUSPEND.getConfigValue(null));
      } else getLogger().send(sender, Lang.UNKNOWN_COMMAND.getConfigValue(null));
    }
    return true;
  }
}
