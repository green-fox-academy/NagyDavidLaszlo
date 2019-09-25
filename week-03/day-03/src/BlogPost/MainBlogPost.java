package BlogPost;

public class MainBlogPost {

  public static void main(String[] args) {

    BlogPost blog1 = new BlogPost("Kiss Béla", "Első nap a suliban", "Jó vót", "2019.02.14.");
    BlogPost blog2 = new BlogPost("Kiss Kálmán", "Nem sz első nap a suliban", "Azzé jó is vót",
        "2019.02.15.");

    blog1.myPrint();
    blog2.myPrint();
  }
}
