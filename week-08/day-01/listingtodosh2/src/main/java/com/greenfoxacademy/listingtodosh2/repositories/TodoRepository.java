package com.greenfoxacademy.listingtodosh2.repositories;

import com.greenfoxacademy.listingtodosh2.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
