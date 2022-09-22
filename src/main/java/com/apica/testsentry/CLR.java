package com.apica.testsentry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class CLR implements CommandLineRunner {

  @Value("${spring.profiles.active}")
  private String environment;

  @Override
  public void run(String... args) throws Exception {
    log.debug("Test debug log from {} environment", environment);
    log.info("Test info log from {} environment", environment);
    log.error("Test error log from {} environment", environment);
  }
}
