package com.greenfoxacademy.thereddit.services;

import com.greenfoxacademy.thereddit.models.Post;
import com.greenfoxacademy.thereddit.models.User;
import com.greenfoxacademy.thereddit.repositories.PostRepository;
import com.greenfoxacademy.thereddit.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
  private PostRepository postRepository;
  private UserRepository userRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository, UserRepository userRepository) {
    this.postRepository = postRepository;
    this.userRepository = userRepository;
  }

  @Override
  public List<Post> listTopTen(int page) {
    if (page < 1) {
      page = 1;
    } else if (page > this.countPages()) {
      page = this.countPages();
    }
    return postRepository.findTenPosts((page - 1) * 10);
  }

  @Override
  public void addPost(Post post, long user_id) {
    Optional<User> optionalUser = userRepository.findById(user_id);
    if (optionalUser.isPresent()) {
      User user = optionalUser.get();
      post.setUser(user);
      List<Post> posts = user.getPosts();
      posts.add(post);
      user.setPosts(posts);
      userRepository.save(user);
    }
  }

  @Override
  public void votePost(long id, String vote) {
    Optional<Post> optionalPost = postRepository.findById(id);
    if (optionalPost.isPresent()) {
      Post post = optionalPost.get();
      if (vote.equals("+")) {
        post.setVote(post.getVote() + 1);
      } else if (vote.equals("-")) {
        post.setVote(post.getVote() - 1);
      }
      postRepository.save(post);
    }
  }

  @Override
  public List<Integer> listPagination() {
    List<Integer> paginationList = new ArrayList<>();
    for (int i = 1; i <= this.countPages(); i++) {
      paginationList.add(i);
    }
    return paginationList;
  }

  @Override
  public int countPages() {
    int pages = postRepository.countPostByIdIsNotNull() / 10;
    if (postRepository.countPostByIdIsNotNull() % 10 > 0) {
      pages++;
    }
    return pages;
  }
}