package io.github.firerealms.commands;

import io.github.firerealms.pLeagueManager;
import io.github.firerealms.configs.Lang;
import io.github.firerealms.managers.UtilManager;
import io.github.firerealms.utils.Logger;
import lombok.Getter;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

@Getter
public class ReloadCommand implements CommandExecutor {
  private final pLeagueManager plugin;
  private final Logger logger;

  public ReloadCommand(final pLeagueManager pLeagueManager, final UtilManager utilManager) {
    this.plugin = pLeagueManager;
    this.logger = utilManager.getLogger();
  }

  @Override
  public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
    if (!sender.hasPermission("leaguemanager.command.reload")) {
      getLogger().send(sender, Lang.INSUFFICIENT_PERMISSION.getConfigValue(null));
    } else {
      getPlugin().setupMessages();
      getPlugin().setup();
      getLogger().send(sender, Lang.RELOAD.getConfigValue(null));
    }
    return true;
  }
}