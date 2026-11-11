package com.jcaa.usersmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.jcaa.usersmanagement")
@EnableJpaRepositories(basePackages = "com.jcaa.usersmanagement")
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }
}