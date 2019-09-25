package BlogPost;

public class BlogPost {

String authorName;
String title;
String text;
String publicationDate;



  public BlogPost(String writer, String articletitle, String text, String onTheDay ){
  authorName=writer;
  title=articletitle;
  this.text=text;
  publicationDate=onTheDay;
  }

  // function

    public void myPrint() {
      System.out.println(authorName + " " + title+ " " + this.text + " "+ publicationDate);
    }

}
