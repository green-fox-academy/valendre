package blog;

import blogpost.BlogPost;
import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> listOfBlogPosts = new ArrayList<>();

  public void add(BlogPost blogpost) {
    listOfBlogPosts.add(blogpost);
  }
  public void delete(int index) {
    listOfBlogPosts.remove(index);
  }
  public void update(int index, BlogPost blogpost) {
    listOfBlogPosts.set(index, blogpost);
  }
}
