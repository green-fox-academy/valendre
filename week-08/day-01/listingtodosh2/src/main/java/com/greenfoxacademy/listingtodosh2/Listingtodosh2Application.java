package com.greenfoxacademy.listingtodosh2;

import com.greenfoxacademy.listingtodosh2.models.Todo;
import com.greenfoxacademy.listingtodosh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtodosh2Application implements CommandLineRunner {
  private TodoRepository repository;

  @Autowired
  public Listingtodosh2Application(TodoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(Listingtodosh2Application.class, args);
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
