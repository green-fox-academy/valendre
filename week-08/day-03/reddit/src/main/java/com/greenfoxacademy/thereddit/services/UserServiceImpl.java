package com.greenfoxacademy.thereddit.services;

import com.greenfoxacademy.thereddit.models.User;
import com.greenfoxacademy.thereddit.repositories.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public void loginForm(String name, String logintype) {
    if (logintype.equals("login")) {
      this.login(name);
    } else if (logintype.equals("register")) {
      this.register(name);
    }
  }

  @Override
  public void register(String name) {
    if (!this.checkExistingUser(name)) {
      User user = new User();
      user.setName(name);
      user.setCurrent(true);
      userRepository.save(user)
    }
  }

  @Override
  public boolean checkExistingUser(String name) {
    return userRepository.countUserByNameEquals(name) > 0;
  }

  @Override
  public void login(String name) {
    if (this.checkExistingUser(name)) {
      User user = userRepository.getUserByName(name);
      user.setCurrent(true);
      userRepository.save(user);
    }
  }

  @Override
  public void logout(long id) {
    Optional<User> optionalUser = userRepository.findById(id);
    if (optionalUser.isPresent()) {
      User user = optionalUser.get();
      user.setCurrent(false);
      userRepository.save(user);
    }
  }

  @Override
  public User getCurrent() {
    return userRepository.getCurrentUser();
  }
}
