package BookLender;

public class Ebook extends Book {
  private String format;
  
  Ebook(String title, String author, int pageCount, String format){
    super(title, author, pageCount);

    this.format = format;
  }

  public String toString() {
    return super.toString() + " " + this.format;
    // return String.format("%s by %s", this.title, this.author);
  }
}
