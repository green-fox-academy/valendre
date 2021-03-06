package com.greenfoxacademy.thereddit.services;

import com.greenfoxacademy.thereddit.models.Post;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface PostService {

  public List<Post> listTopTen(int page);
  public void addPost(Post post, long user_id);
  public void votePost(long id, String vote);
  public List<Integer> listPagination();
  public int countPages();
}


