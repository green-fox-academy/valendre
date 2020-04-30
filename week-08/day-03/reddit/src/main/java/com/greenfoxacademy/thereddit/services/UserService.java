package com.greenfoxacademy.thereddit.services;

import com.greenfoxacademy.thereddit.models.User;

public interface UserService {
  public void register(String name);
  public boolean check(String name);
  public void login(String name);
  public void logout(long id);
  public User getCurrent();
}
