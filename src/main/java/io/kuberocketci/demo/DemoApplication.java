package io.kuberocketci.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Sppring Boot application class for KubeRocketCI demo.
 */
@SpringBootApplication
public class DemoApplication {

  /**
   * Application entry point.
   *
   * @param args command line arguments
   */
  public static void main(final String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
