package com.greenfoxacademy.thereddit.repositories;

import com.greenfoxacademy.thereddit.models.Post;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  @Query(value = "SELECT * FROM post ORDER BY vote DESC LIMIT 10 OFFSET :skipper", nativeQuery = true)
  List<Post> findTenPosts(int skipper);

}
