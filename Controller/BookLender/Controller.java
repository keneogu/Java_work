package BookLender;

public class Controller {
  public static void main(String[] args) {
    // User user = new User("Mark", "1992-02-02");

    Book book = new Book("Carmilla", "Kene Ogu", 270);
    AudioBook dracula = new AudioBook("Dracula", "Bram Dracula", 3000);
    Ebook jeeves = new Ebook("Carry on", "Wode house", 200, "PDF");
    // System.out.println(dracula.toString());
    // System.out.println(jeeves.toString());

    System.out.println(jeeves.toString());



    // user.borrow(book);

    // System.out.printf("%s was born back in %s and he is now %s \n", user.getName(), user.getBirthday(), user.age());
    // System.out.printf("%s has borrowed these books: %s with %d pages", user.getName(), user.borrowedBooks(), book.getPageCount());
  }

}
