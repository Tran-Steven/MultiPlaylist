package com.transteven.multiplaylist.config;

import com.server.cinema.util.interfaces.InitRunnable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class DatabaseInitConfig {

  private final List<InitRunnable> initRunnables;

  @Autowired
  public DatabaseInitConfig(
    @Qualifier("initRunnables") final List<InitRunnable> initRunnables
  ) {
    this.initRunnables = initRunnables;
  }
}
