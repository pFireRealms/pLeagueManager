package io.github.firerealms.managers;

import io.github.firerealms.pLeagueManager;
import io.github.firerealms.utils.Helper;
import io.github.firerealms.utils.Logger;
import lombok.Getter;

@Getter
public class UtilManager {
  private final Logger logger;
  private final Helper helper;

  public UtilManager(final pLeagueManager plugin) {
    this.logger = new Logger(plugin);
    this.helper = new Helper(plugin);
  }
}
