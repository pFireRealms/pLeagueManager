package io.github.firerealms.commands;

import io.github.firerealms.configs.Lang;
import io.github.firerealms.managers.UtilManager;
import io.github.firerealms.utils.Logger;
import lombok.Getter;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

@Getter
public class HelpCommand implements CommandExecutor {
  private final Logger logger;

  public HelpCommand(final UtilManager utilManager) {
    this.logger = utilManager.getLogger();
  }

  @Override
  public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
    if (!sender.hasPermission("leaguemanager.command.help")) {
      getLogger().send(sender, Lang.INSUFFICIENT_PERMISSION.getConfigValue(null));
    } else getLogger().send(sender, Lang.HELP.getConfigValue(null));
    return true;
  }
}