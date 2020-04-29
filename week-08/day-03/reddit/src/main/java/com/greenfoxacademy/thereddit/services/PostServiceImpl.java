package com.greenfoxacademy.thereddit.services;

import com.greenfoxacademy.thereddit.models.Post;
import com.greenfoxacademy.thereddit.repositories.PostRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{
  private PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public List<Post> listTopTen(int page) {
    return postRepository.findTenPosts(page*10);
  }

  @Override
  public void addPost(Post post) {
    postRepository.save(post);
  }

  @Override
  public void votePost(long id, String vote) {
    Optional<Post> optionalPost = postRepository.findById(id);
    if (optionalPost.isPresent()) {
      Post post = optionalPost.get();
      if (vote.equals("+")) {
        post.setVote(post.getVote()+1);
      } else if (vote.equals("-")) {
        post.setVote(post.getVote()-1);
      }
      postRepository.save(post);
    }
  }
}
