package blog;

import blogpost.BlogPost;

public class Main {
  public static void main(String[] args) {
    Blog myBlog = new Blog();

    myBlog.add(new BlogPost("John Doe","Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04."));
    myBlog.add(new BlogPost("Tim Urban","Wait but why",
        "A popular long-form, stick-figure-illustrated blog about almost everything.",
        "2010.10.10."));
    myBlog.add(new BlogPost("William Turton",
        "One Engineer Is Trying to Get IBM to Reckon With Trump",
        "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of " +
            "attention. When I asked to take his picture outside one of IBM’s New York City " +
            "offices, he told me that he wasn’t really into the whole organizer profile thing.",
        "2017. 3. 28."));
    myBlog.delete(1);
    myBlog.update(1,new BlogPost("Walliam NurtoT",
        "Two Engineer are Trying to Get IBM to Reckon With Trump",
        "Haniel Danley, a cybersecurity engineer at IBM, doesn’t want to be the center of " +
            "attention. When I asked to take his picture outside one of IBM’s Los Angeles " +
            "offices, he told me that he wasn’t really into the whole organizer profile thing.",
        "2020. 3. 18."));
  }

}
