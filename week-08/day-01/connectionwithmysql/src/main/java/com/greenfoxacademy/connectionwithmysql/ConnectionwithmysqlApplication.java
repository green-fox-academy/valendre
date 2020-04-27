package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner {
  private TodoRepository repository;

  @Autowired
  public ConnectionwithmysqlApplication(TodoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(com.greenfoxacademy.connectionwithmysql.ConnectionwithmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Todo("I have to learn Object Relational Mapping"));
    repository.save(new Todo("Start the day"));
    repository.save(new Todo("Finish H2 workshop1"));
    repository.save(new Todo("Finish JPA workshop2"));
    repository.save(new Todo("Create a CRUD project"));
  }
}
