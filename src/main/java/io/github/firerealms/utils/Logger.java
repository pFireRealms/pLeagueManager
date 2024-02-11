package io.github.firerealms.utils;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@SuppressWarnings("unused")
public class Logger {
  private final PluginDescriptionFile description;
  private final List<String> banner = new ArrayList<>();
  private final ConsoleCommandSender consoleSender;

  public Logger(final Plugin plugin) {
    this.description = plugin.getDescription();
    this.consoleSender = Bukkit.getConsoleSender();
  }

  public void send(final CommandSender sender, final String message) {
    sender.sendMessage(message);
  }

  public void send(final String rank, final String message) {
    Bukkit.broadcast(message, "group." + rank);
    consoleSender.sendMessage(message);
  }

  public void sendActionBar(final Player player, final String message) {
    // Not supported in vanilla Bukkit API
    // Implement your custom action bar messaging system here
  }

  public void broadcastBar(final String message) {
    // Not supported in vanilla Bukkit API
    // Implement your custom broadcast action bar messaging system here
  }

  public void sendBanner() {
    final List<String> authors = description.getAuthors();
    final String formattedAuthors = authors.stream().collect(Collectors.joining(", "));
    final String pluginName = description.getFullName();
    final String serverName = Bukkit.getServerName();
    final String version = Bukkit.getBukkitVersion();
    final String serverNameVersion = serverName + " - " + version;

    banner.add("&r");
    banner.add("&c   888888 &f88     &48b    d8   &c" + pluginName);
    banner.add("&c   88  88 &f88     &488b  d88   &4Authors: &f" + formattedAuthors);
    banner.add("&c   888888 &f88  .o &488YbdP88");
    banner.add("&c   88     &f88ood8 &488 YY 88   &8Running on " + serverNameVersion);
    banner.add("&r");

    for (final String message : banner)
      consoleSender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
  }
}
