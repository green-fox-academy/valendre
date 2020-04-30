package com.greenfoxacademy.connectionwithmysql.repositories;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  @Query(value = "SELECT * FROM todo_list WHERE title LIKE :search OR content LIKE :search OR description LIKE :search", nativeQuery = true)
  Iterable<Todo> findTodo(String search);

}
