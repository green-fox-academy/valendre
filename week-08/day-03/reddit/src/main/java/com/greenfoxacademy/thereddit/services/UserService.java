package com.greenfoxacademy.thereddit.services;

import com.greenfoxacademy.thereddit.models.User;

public interface UserService {
  public void loginForm(String name, String logintype);
  public void register(String name);
  public boolean checkExistingUser(String name);
  public void login(String name);
  public void logout(long id);
  public User getCurrent();
}
