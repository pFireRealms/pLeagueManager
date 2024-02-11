package io.github.firerealms;

import io.github.firerealms.commands.BaseCommand;
import io.github.firerealms.commands.timers.OneXEightCommand;
import io.github.firerealms.commands.timers.ResultCommand;
import io.github.firerealms.commands.timers.TimerCommand;
import io.github.firerealms.commands.timers.TwoXFourCommand;
import io.github.firerealms.configs.Config;
import io.github.firerealms.configs.Lang;
import io.github.firerealms.managers.ConfigManager;
import io.github.firerealms.managers.ListenerManager;
import io.github.firerealms.managers.UtilManager;
import lombok.Getter;
import lombok.Setter;
import net.luckperms.api.LuckPerms;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class pLeagueManager extends JavaPlugin {
  private final ConfigManager messagesFile = new ConfigManager(this, "");
  private static YamlConfiguration config;
  @Setter private LuckPerms luckPermsAPI = null;
  @Setter private UtilManager utilManager;
  @Setter private ListenerManager listenerManager;

  @Override
  public void onEnable() {
    setupMessages();
    Config.setup(this);
    loadConfigs();

    if (!setupLuckPermsAPI()) {
      getLogger().info("&cDisabled due to no LuckPerms dependency found!");
      getServer().getPluginManager().disablePlugin(this);
    }

    setUtilManager(new UtilManager(this));
    setListenerManager(new ListenerManager(this, getUtilManager()));
    getUtilManager().getLogger().sendBanner();
    getLogger().info("Loading commands...");
    setup();
    getLogger().info("Loading listeners...");
    getLogger().info("Successfully enabled!");
  }

  @Override
  public void onDisable() {
    getListenerManager().unregisterListeners();
  }

  public void setup() {
    getCommand("leagueManager").setExecutor(new BaseCommand(this, getUtilManager()));
    getCommand("timer").setExecutor(new TimerCommand(this, getUtilManager()));
    getCommand("result").setExecutor(new ResultCommand(this, getUtilManager()));
    getCommand("2x4").setExecutor(new TwoXFourCommand(this, getUtilManager()));
    getCommand("1x8").setExecutor(new OneXEightCommand(this, getUtilManager()));

    if (getListenerManager().isRegistered()) getListenerManager().unregisterListeners();
    getListenerManager().registerListeners();

  }

  public void setupMessages() {
    getMessagesFile().createNewFile("messages.yml", "Loading messages.yml", "LeagueManager Messages");
    loadMessages();
  }

  private boolean setupLuckPermsAPI() {
    RegisteredServiceProvider<LuckPerms> lpp = getServer().getServicesManager().getRegistration(LuckPerms.class);
    if (lpp != null) setLuckPermsAPI(lpp.getProvider());
    return getLuckPermsAPI() != null;
  }

  private void loadMessages() {
    Lang.setFile(getMessagesFile().getConfig("libs/messages.yml"));

    for (final Lang value : Lang.values())
      getMessagesFile().getConfig("libs/messages.yml").addDefault(value.getPath(), value.getDefault());

    getMessagesFile().getConfig("libs/messages.yml").options().copyDefaults(true);
    getMessagesFile().saveConfig("libs/messages.yml");
  }

  private void loadConfigs() {
    config = Config.getConfig("config.yml");
  }
}
