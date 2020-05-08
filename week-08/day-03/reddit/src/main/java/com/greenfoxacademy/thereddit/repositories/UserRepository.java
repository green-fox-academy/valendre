package com.greenfoxacademy.thereddit.repositories;

import com.greenfoxacademy.thereddit.models.User;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  int countUserByNameEquals(String name);

  User findByName(String name);


  @Query(value="SELECT * FROM User WHERE name = :name LIMIT 1", nativeQuery = true)
  User getUserByName(String name);

  @Query(value="SELECT * FROM User WHERE current=true LIMIT 1", nativeQuery = true)
  User getCurrentUser();
}
