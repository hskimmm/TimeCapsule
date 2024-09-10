package com.ahi.timecapsule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TimecapsuleApplication {

  public static void main(String[] args) {
    SpringApplication.run(TimecapsuleApplication.class, args);
  }
}
