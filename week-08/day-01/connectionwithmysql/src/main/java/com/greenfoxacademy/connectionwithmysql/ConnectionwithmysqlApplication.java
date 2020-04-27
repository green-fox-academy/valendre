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
    /*
    repository.save(new Todo("daily task", false, false));
    repository.save(new Todo("make the beds", true, true));
    repository.save(new Todo("do the washing up", true, false));
    repository.save(new Todo("lean the bathroom and th kitchen", true, false));
    repository.save(new Todo("Wipe all the surfaces with a cloth", false, false));
    repository.save(new Todo("remove the grease", true, true));
    repository.save(new Todo("tidy up", false, false));
    repository.save(new Todo("throw away tre rubbish"));
    repository.save(new Todo("broom", true, false));
    repository.save(new Todo("sweep the floors", true, false));
    repository.save(new Todo("wash the floors"));
    repository.save(new Todo("mop", true, true));
    repository.save(new Todo("vacuum the carpet", true, false));
    repository.save(new Todo("vacuum cleaner / hoover"));
    repository.save(new Todo("dust the furniture", true, true));
     */
  }
}
