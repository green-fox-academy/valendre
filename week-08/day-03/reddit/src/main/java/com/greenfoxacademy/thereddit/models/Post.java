package com.greenfoxacademy.thereddit.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name = "seq", initialValue = 2, allocationSize = 50)
public class Post {

  @Id
  @GeneratedValue
  private long id;
  private String title;
  private String url;
  private int vote;

  @Temporal(TemporalType.DATE)
  private Date date;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn
  private User user;

  public Post() {
    this.date = new Date();
  }

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
    this.date = new Date();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public int getVote() {
    return vote;
  }

  public void setVote(int vote) {
    this.vote = vote;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getName() {
    if (this.user != null) {
      return this.user.getName();
    }
    return null;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
