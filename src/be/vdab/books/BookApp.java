package be.vdab.books;

public class BookApp {
    public static void main(String[] args) {
        Author jRRTolkien = new Author("JRR Tolkien", "j_tolkien@gmail.com", Author.Gender.M);
        Book lordOfTheRings = new Book("Lord Of The Rings", jRRTolkien, 49);
        System.out.println(jRRTolkien.toString());
        System.out.println(lordOfTheRings.toString());

    }
}
