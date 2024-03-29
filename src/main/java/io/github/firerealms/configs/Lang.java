package io.github.firerealms.configs;

import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

@Getter
public enum Lang {
  ON("on", "&a&luključen"),
  OFF("off", "&c&lisključen"),
  RELOAD("reload", "&a▎ &fPlugin reloaded!"),
  UNKNOWN_COMMAND("unknown-command", "&4▎ &cUnknown command."),
  INSUFFICIENT_PERMISSION("insufficient-permission", "&4▎ &cInsufficient permission."),
  INGAME_ONLY("ingame-only", "&4▎ &cThis command can be used only in game."),
  TOGGLE("toggle", "&a▎ &fFootcube je &e{0} &fod strane &b{1}&f."),
  FOOTCUBE_DISABLED("footcube-disabled", "&4▎ &cFootcube is currently disabled."),
  INVALID_TIME("invalid-time", "&4▎ &cYour time argument \"&e{0}&c\" is invalid."),
  HELP("help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&d &lLeague&e&lManager &7- &rHelp command.",
      "&r &r",
      "&6 /&eplm reload &7- &fReloads the plugin.",
      "&6 /&eplm toggle &7- &fToggles FootCube.",
      "&r &r", "&e &lTeam Commands:&r",
      "&6 /&eplm ct&6|&ecreateteam &2<&ateam-name&2> <&acolored-tag&2>",
      "&7   - &fCreate a team with the colored tag (ex cel and &4C&0E&4L&r).",
      "&7   - &fExample: &6/&elm ct nkp &0N&fK&0P",
      "&7   - &fExample 2: &6/&elm ct vksb &1F&fK&1B",
      "&6 /&eplm dt&6|&edeleteteam &2<&ateam-name&2>",
      "&7   - &fDelete an existing team.",
      "&r &r", "&b &lUser Commands:&r",
      "&6 /&eplm st&6|&esetteam &2<&aplayer-name&2> <&ateam-name&2>",
      "&7   - &fAdd player to a team (ex cel) with the branch.",
      "&7   - &fExample: &6/&elm st Neeonn nkp",
      "&7   - &fExample: &6/&elm st 1nvader vksb",
      "&6 /&eplm ut&6|&eunsetteam &2<&aplayer-name&2> <&ateam-name&2>",
      "&7   - &fRemove player from a team.",
      "&6 /&eplm sm&6|&esetmanager &2<&aplayer-name&2> <&ateam-name&2>",
      "&7   - &fMake player a team manager.",
      "&6 /&eplm um&6|&eunsetmanager &2<&aplayer-name&2> <&ateam-name&2>",
      "&7   - &fRemove manager role from player.",
      "&6 /&eplm ban &2<&aplayer-name&2> <&aduration&2> &3[&breason&3]",
      "&7   - &fBan player from FC. Example: &6/&elm ban Neeonn 2h Rage Quit",
      "&6 /&eplm unban &2<&aplayer-name&2>",
      "&7   - &fUnban player from FC.",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  TEAM_CREATED("team.created", "&a▎ &fTeam {0} &fhas been successfully &2created&f!"),
  TEAM_DELETED("team.deleted", "&a▎ &fTeam {0} &fhas been successfully &8deleted&f!"),
  TEAM_NOT_FOUND("team.not-found", "&4▎ &cTeam {0} &cwasn't found!"),
  TEAM_ALREADY_DEFINED("team.already-defined", "&4▎ &cTeam {0} &calready exists!"),
  TEAM_USAGE_CREATE("team.usage.create", String.join(System.lineSeparator(),
      "&4▎ &cInvalid arguments. Usage:",
      "&4▎ &6/&elm ct&6|&ecreateteam &2<&ateam-name&2> <&acolored-tag&2>")),
  TEAM_USAGE_DELETE("team.usage.delete", String.join(System.lineSeparator(),
      "&4▎ &cInvalid arguments. Usage:",
      "&4▎ &6/&elm dt&6|&edeleteteam &2<&ateam-name&2>")),
  TEAM_HELP("team.help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&d &lLeague&e&lManager &7- &rTeam commands.",
      "&r &r",
      "&6 /&eplm ct&6|&ecreateteam &2<&ateam-name&2> <&acolored-tag&2>",
      "&7   - &fCreate a team with the colored tag (ex cel and &4C&0E&4L&r).",
      "&7   - &fExample: &6/&elm ct nkp &0N&fK&0P",
      "&7   - &fExample 2: &6/&elm ct vksb &1F&fK&1B",
      "&6 /&eplm dt&6|&edeleteteam &2<&ateam-name&2>",
      "&7   - &fDelete an existing team.",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  USER_NOT_FOUND("user.not-found", "&4▎ &cPlayer wasn't found."),
  USER_ADDED_TO_TEAM("user.added-to-team", "&a▎ &fPlayer &b{0} &fhas been successfully &aadded &fto team &e{1}&f!"),
  USER_SET_MANAGER("user.set-manager", "&a▎ &fPlayer &b{0} &fhas been made manager of the &e{1} &fteam!"),
  USER_REMOVED_FROM_A_TEAM("user.removed-from-a-team", "&a▎ &fPlayer &b{0} &fhas been successfully &cremoved &ffrom team &e{1}&f!"),
  USER_UNSET_MANAGER("user.unset-manager", "&a▎ &fPlayer &b{0} &fhas been successfully &cremoved &ffrom the role of manager for the team &e{1}&f!"),
  USER_NOT_IN_THAT_TEAM("user.not-in-that-team", "&4▎ &cPlayer &b{0} &cis not in the &e{1} &cteam!"),
  USER_NOT_MANAGER("user.not-manager", "&4▎ &cPlayer &b{0} &cis not a manager of the &e{1} &cteam!"),
  USER_ALREADY_IN_THAT_TEAM("user.already-in-that-team", "&4▎ &cPlayer &b{0} &cis already in &e{1} &cteam!"),
  USER_ALREADY_MANAGER("user.already-manager", "&4▎ &cPlayer &b{0} &cis already a manager of the &e{1} &cteam!"),
  USER_BAN("user.ban", "&a▎ &fPlayer &b{0} &fhas been successfully banned for &e{1}&f for '&4{2}&f'!"),
  USER_BANNED("user.banned", "&4▎ &cYou have been banned from FC for &e{0} &cfor '&4{1}&c'!"),
  USER_STILL_BANNED("user.still-banned", String.join(System.lineSeparator(),
      "&4▎ &cYou are banned from FC!",
      "&4▎ &cYour ban will expire in: &e{0}&c.")),
  USER_UNBAN("user.unban", "&a▎ &fPlayer &b{0} &fhas been successfully unbanned!"),
  USER_UNBANNED("user.unbanned", "&8▎ &aYou've been unbanned from FC!"),
  USER_NOT_BANNED("user.not-banned", "&4▎ &cPlayer &b{0} &cis not banned from FC!"),
  USER_ALREADY_BANNED("user.already-banned", "&4▎ &cPlayer &b{0} &cis already banned from FC! Unban them first."),
  USER_SUSPEND("user.suspend", "&a▎ &fPlayer &b{0} &fhas been successfully suspended for &e{1}&f for '&4{2}&f'!"),
  USER_SUSPENDED("user.suspended", "&4▎ &cYou have been suspended from participating in league matches for &e{0} &cfor '&4{1}&c'!"),
  USER_ALREADY_SUSPENDED("user.already-suspended", "&4▎ &cPlayer &b{0} &cis already suspended! Unsuspend them first."),
  USER_UNSUSPEND("user.unsuspend", "&a▎ &fPlayer &b{0} &fhas been successfully unsuspended!"),
  USER_UNSUSPENDED("user.unbanned", "&8▎ &aYou've been unsuspended!"),
  USER_NOT_SUSPENDED("user.not-suspended", "&4▎ &cPlayer &b{0} &cis not suspended!"),
  USER_USAGE_SET("user.usage.set", String.join(System.lineSeparator(),
      "&4▎ &cInvalid arguments. Usage:",
      "&4▎ &6/&elm st&6|&esetteam &2<&aplayer-name&2> <&ateam-name&2>")),
  USER_USAGE_UNSET("user.usage.unset", String.join(System.lineSeparator(),
      "&4▎ &cInvalid arguments. Usage:",
      "&4▎ &6/&elm ut&6|&eunsetteam &2<&aplayer-name&2> <&ateam-name&2>")),
  USER_USAGE_SET_MANAGER("user.usage.make-manager", String.join(System.lineSeparator(),
      "&4▎ &cInvalid arguments. Usage:",
      "&4▎ &6/&elm sm&6|&esetmanager &2<&aplayer-name&2> <&ateam-name&2>")),
  USER_USAGE_UNSET_MANAGER("user.usage.make-manager", String.join(System.lineSeparator(),
      "&4▎ &cInvalid arguments. Usage:",
      "&4▎ &6/&elm um&6|&eunsetmanager &2<&aplayer-name&2> <&ateam-name&2>")),
  USER_USAGE_BAN("user.usage.ban", String.join(System.lineSeparator(),
      "&4▎ &cInvalid arguments. Usage:",
      "&4▎ &6/&elm ban &2<&aplayer-name&2> <&aduration&2> &3[&breason&3]")),
  USER_USAGE_SUSPEND("user.usage.suspend", String.join(System.lineSeparator(),
      "&4▎ &cInvalid arguments. Usage:",
      "&4▎ &6/&elm suspend &2<&aplayer-name&2> <&aduration&2> &3[&breason&3]")),
  USER_USAGE_UNBAN("user.usage.unban", String.join(System.lineSeparator(),
      "&4▎ &cInvalid arguments. Usage:",
      "&4▎ &6/&elm unban &2<&aplayer-name&2>")),
  USER_USAGE_UNSUSPEND("user.usage.unsuspend", String.join(System.lineSeparator(),
      "&4▎ &cInvalid arguments. Usage:",
      "&4▎ &6/&elm unsuspend &2<&aplayer-name&2>")),
  USER_HELP("user.help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&d &lLeague&e&lManager &7- &rUser commands.",
      "&r &r",
      "&6 /&eplm st&6|&esetteam &2<&aplayer-name&2> <&ateam-name&2>",
      "&7   - &fAdd player to a team (ex cel) with the branch.",
      "&7   - &fExample: &6/&elm st Neeonn nkp",
      "&7   - &fExample: &6/&elm st 1nvader vksb",
      "&6 /&eplm ut&6|&eunsetteam &2<&aplayer-name&2> <&ateam-name&2>",
      "&7   - &fRemove player from a team.",
      "&6 /&eplm sm&6|&esetmanager &2<&aplayer-name&2> <&ateam-name&2>",
      "&7   - &fMake player a team manager.",
      "&6 /&eplm um&6|&eunsetmanager &2<&aplayer-name&2> <&ateam-name&2>",
      "&7   - &fRemove manager role from player.",
      "&6 /&eplm ban &2<&aplayer-name&2> <&aduration&2> &3[&breason&3]",
      "&7   - &fBan player from FC. Example: &6/&elm ban Neeonn 2h Rage Quit",
      "&6 /&eplm unban &2<&aplayer-name&2>",
      "&7   - &fUnban player from FC.",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  TIMER_HELP("timer.help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&d &lLeague&e&lManager &7- &rTimer Commands.",
      "&r &r",
      "&6 /&etimer start &2<&atime&2> &3[&bprefix&3]",
      "&6 /&etimer stop",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  TIMER_CREATE("timer.create", "&a▎ &fSuccessfully started timer with id &e{0}&f."),
  TIMER_STOP("timer.stop", "&a▎ &fSuccessfully stopped timer with id &e{0}&f."),
  TIMER_STARTING("timer.starting", "&6▎ {0} &6┃ &fHost starting!"),
  TIMER_END("timer.end", "{0} &6┃ &fTimer finished!"),
  TIMER_OVER("timer.over", "&a▎ &fTimer with id &e{0} &fis over!"),
  TIMER_CURRENT_TIME("timer.current-time", "{0} &7┃ &fCurrent Time: &e{1}/{2}"),
  TIMER_NOT_AVAILABLE("timer.not-available", "&4▎ &cThere aren't any timers running."),
  TIMER_ALREADY_RUNNING("timer.already-running", "&4▎ &cThere already is a timer running."),
  TIMER_PREFIX_SET("timer.prefix-set", "&a▎ &fPrefix successfully set to {0}&f."),
  TIMER_TEAMS_SET("timer.teams-set", "&a▎ &fTeams successfully set to {0} &fand {1}&f."),
  TIMER_TIME_SET("timer.time-set", "&a▎ &fTime successfully set to {0}&f."),
  TIMER_RESET("timer.reset", "&a▎ &fTimer command successfully reset!"),
  TIMER_NOT_SETUP("timer.not-setup", "&4▎ &cYou haven't configured teams, time or prefix."),
  RESULT_HELP("result.help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&f &lSetup Commands:",
      "&6 /&ers prefix &2<&aprefix&2> &7(&f/rs prefix &b&lEvent&7)",
      "&6 /&ers teams &2<&ahome&2> <&aaway&2> &7(&f/rs teams nkp vtz&7)",
      "&6 /&ers time &2<&atime&2> &7(&f/rs time 20min&7)",
      "&r &r",
      "&e &lControl Commands:",
      "&6 /&ers start&6|&estop",
      "&6 /&ers pause&6|&eresume",
      "&7 - &fUse &epause &fat the end of the First Half.",
      "&7 - &fUse &eresume &fat the beginning of the Second Half.",
      "&6 /&ers extend &2<&atime&2> &7(&f/rs extend 2min30s&7)",
      "&6 /&ers add&6|&erem&6(&e&oove&6) &ehome&6|&eaway &7(&f/rs add vtz&7)",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  RESULT_ADD("result.add", "&a▎ &fAdded one goal for the team {0}&f."),
  RESULT_FULL_LIVES("result.full-lives", "&4▎ &cTeam {0} &calready has all lives."),
  RESULT_ELIMINATED("result.eliminated", "&4▎ &cTeam {0} &cis already eliminated."),
  RESULT_RESET("result.reset", "&a▎ &fTeams are reset!"),
  RESULT_REMOVE("result.remove", "&a▎ &fRemoved one goal for the team {0}&f."),
  RESULT_USAGE("result.add-usage", "&4▎ &cYou need to specify a team."),
  RESULT_STARTING("result.starting", "{0} &7┃ &fHost starting!"),
  RESULT_ACTIONBAR("result.actionbar", "{0} &7┃ &f{1} &e{2} - {3} &f{4} &7┃ &f{5}{6}/{7}{8}"),
  RESULT_ACTIONBAR_HT("result.actionbar-ht", "{0} &7┃ &f{1} &e{2} - {3} &f{4} &7┃ &fHalf Time!"),
  RESULT_END("result.end", "{0} &7┃ &fMatch finished! Result: &f{1} &e{2} &f- &e{3} &f{4}&f."),
  RESULT_HALFTIME("result.halftime", "&6▎ {0} &6┃ &fHalf Time! Result: &f{1} &e{2} &f- &e{3} &f{4}&f."),
  RESULT_SECONDHALF("result.secondhalf", "&6▎ {0} &6┃ &fMatch continuing - Second Half! Result: &f{1} &e{2} &f- &e{3} &f{4}&f."),
  RESULT_OVER("result.over", "&6▎ {0} &6┃ &fMatch finished! Result: &f{1} &e{2} &f- &e{3} &f{4}&f."),
  TWO_TIMES_FOUR_HELP("result.2x4.help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&6 /&e2x4 start&6|&estop",
      "&6 /&e2x4 type &2<&atype&2> &7- &fEvent type (&o2x4/3x4/...&f).",
      "&6 /&e2x4 add&6/&erem team_color &7(&f/2x4 add blue&7)",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  TWO_TIMES_FOUR_ACTIONBAR("result.2x4.actionbar", "{0} &7┃ &fResult: &b{1} &c{2} &a{3} &e{4} &7┃ &fTime: &e{5}"),
  TWO_TIMES_FOUR_RESULT_OVER("result.2x4.over", "&6▎ {0} &6┃ &fMatch over! Result: &b{1} &c{2} &a{3} &e{4}&f!"),
  TWO_TIMES_FOUR_RESULT_END("result.2x4.end", "{0} &6┃ &fMatch over! Result: &b{1} &c{2} &a{3} &e{4}"),
  ONE_TIMES_EIGHT_HELP("result.1x8.help", String.join(System.lineSeparator(),
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r",
      "&6 /&e1x8 start&6|&estop",
      "&6 /&e1x8 type &2<&atype&2> &7- &fEvent type (1x8/2x8/...&f).",
      "&6 /&e1x8 add&6/&erem team_color &7(&f/1x8 rem red&7)",
      "&7▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬&r")),
  ONE_TIMES_EIGHT_ACTIONBAR("result.1x8.actionbar", "{0} &7┃ &fResult: &8{1} &c{2} &6{3} &e{4} &a{5} &b{6} &d{7} &0{8} &7┃ &fTime: &e{9}"),
  ONE_TIMES_EIGHT_RESULT_OVER("result.1x8.over", "&6▎ {0} &6┃ &fMatch over! Result: &8{1} &c{2} &6{3} &e{4} &a{5} &b{6} &d{7} &0{8}&f!"),
  ONE_TIMES_EIGHT_RESULT_END("result.1x8.end", "{0} &6┃ &fMatch over! Result: &8{1} &c{2} &6{3} &e{4} &a{5} &b{6} &d{7} &0{8}"),
  TIMER_ADDED_EXTRA_TIME("result.extra-time-added", "&a▎ &fAdded &e{0} &fof extra time."),
  WEBHOOK_NOT_SETUP("webhook.not-setup", "&4▎ &cNiste dodali URL za Discord Webhook u config.yml!"),
  WEBHOOK_MATCH_START("webhook.match-start", "Početak utakmice **{0} - {1}**."),
  WEBHOOK_MATCH_ENDED("webhook.match-ended", "Kraj utakmice, rezultat: **{0} {1} - {2} {3}**. Trajanje: **`{4}`**."),
  WEBHOOK_MATCH_HALFTIME("webhook.match-halftime", "Poluvreme, rezultat: **{0} {1} - {2} {3}**."),
  WEBHOOK_MATCH_SECONDHALF("webhook.match-secondhalf", "Početak drugog poluvremena, rezultat: **{0} {1} - {2} {3}**."),
  WEBHOOK_MATCH_SCORE("webhook.match-score", "**GOOL!** Scorer: **{0}** (**{1}** - **`{2}`**)!"),
  WEBHOOK_MATCH_ASSIST("webhook.match-assist", "**GOOL!** Scorer: **{0}** (**{1}** - **`{2}`**)! Asistent: **{3}**."),
  WEBHOOK_PLAYER_NOT_IN_TEAM("webhook.player-not-in-team", "&4▎ &cIgrač &b{0} &cnije u {1} &ctimu!");

  private static FileConfiguration LANG;
  private final String path, def;

  Lang(final String path, final String start) {
    this.path = path;
    this.def = start;
  }

  public static void setFile(final FileConfiguration config) {
    LANG = config;
  }

  public String getDefault() {
    return this.def;
  }

  public String getConfigValue(final String[] args) {
    String value = ChatColor.translateAlternateColorCodes('&', LANG.getString(this.path, this.def));

    if (args == null) return value;
    else {
      if (args.length == 0) return value;
      for (int i = 0; i < args.length; i++) value = value.replace("{" + i + "}", args[i]);
      value = ChatColor.translateAlternateColorCodes('&', value);
    }

    return value;
  }
}
