package io.github.divinerealms.commands;

import io.github.divinerealms.LeagueManager;
import io.github.divinerealms.commands.player.BanPlayerCommand;
import io.github.divinerealms.commands.player.SetTeamCommand;
import io.github.divinerealms.commands.player.UnbanPlayerCommand;
import io.github.divinerealms.commands.player.UnsetTeamCommand;
import io.github.divinerealms.commands.team.CreateTeamCommand;
import io.github.divinerealms.commands.team.DeleteTeamCommand;
import io.github.divinerealms.managers.UtilManager;
import io.github.divinerealms.utils.Logger;
import lombok.Getter;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BaseCommand implements CommandExecutor {
  @Getter private final LeagueManager plugin;
  @Getter private final UtilManager utilManager;
  @Getter private final Logger logger;

  public BaseCommand(final LeagueManager plugin, final UtilManager utilManager) {
    this.plugin = plugin;
    this.utilManager = utilManager;
    this.logger = utilManager.getLogger();
  }

  @Override
  public boolean onCommand(final CommandSender sender, final Command cmd, String label, String[] args) {
    if (args.length < 1 || args[0].equalsIgnoreCase("help")) {
      final HelpCommand helpCommand = new HelpCommand(getUtilManager());
      helpCommand.onCommand(sender, cmd, label, args);
    }

    switch (args[0]) {
      case "reload":
      case "rl":
        final ReloadCommand reloadCommand = new ReloadCommand(getPlugin(), getUtilManager());
        reloadCommand.onCommand(sender, cmd, label, args);
        break;
      case "toggle":
        final ToggleCommand toggleCommand = new ToggleCommand(getUtilManager());
        toggleCommand.onCommand(sender, cmd, label, args);
        break;
      case "ban":
        final BanPlayerCommand banPlayerCommand = new BanPlayerCommand(getUtilManager());
        banPlayerCommand.onCommand(sender, cmd, label, args);
        break;
      case "unban":
        final UnbanPlayerCommand unbanPlayerCommand = new UnbanPlayerCommand(getUtilManager());
        unbanPlayerCommand.onCommand(sender, cmd, label, args);
        break;
      case "setTeam":
      case "st":
        final SetTeamCommand setTeamCommand = new SetTeamCommand(getUtilManager());
        setTeamCommand.onCommand(sender, cmd, label, args);
        break;
      case "unsetTeam":
      case "ut":
        final UnsetTeamCommand unsetTeamCommand = new UnsetTeamCommand(getUtilManager());
        unsetTeamCommand.onCommand(sender, cmd, label, args);
        break;
      case "createTeam":
      case "ct":
        final CreateTeamCommand createTeamCommand = new CreateTeamCommand(getPlugin(), getUtilManager());
        createTeamCommand.onCommand(sender, cmd, label, args);
        break;
      case "deleteTeam":
      case "dt":
        final DeleteTeamCommand deleteTeamCommand = new DeleteTeamCommand(getPlugin(), getUtilManager());
        deleteTeamCommand.onCommand(sender, cmd, label, args);
        break;
      default:
        getLogger().sendMessage(sender, "unknown-command");
    }
    return true;
  }
}