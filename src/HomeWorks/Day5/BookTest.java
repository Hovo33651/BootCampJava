package HomeWorks.Day5;

public class BookTest {
    public static void main(String[] args) {
        /**
         *create 2 instances of Book, which has same author
         * print all info about books
         */

        Book book1 = new Book("The Last Time We Live", new Author("Semirjian A.", "THTWL@gmail.com", 'M'), 6500);
        Book book2 = new Book("Blue Cyrus", new Author("Albanian A.", "alb@gmail.com"), 2990);
        Book book3 = new Book("Blue ", new Author("Albanian A.", "alb@gmail.com"), 3500);
        book1.allInfoAboutBook();
        book2.allInfoAboutBook();
        book3.allInfoAboutBook();
        book1.infoAuthor();
        book2.infoAuthor();
        book3.infoAuthor();
    }
}
