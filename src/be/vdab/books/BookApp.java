package be.vdab.books;

public class BookApp {
    public static void main(String[] args) {

        //Create Autor
        Author jRRTolkien = new Author("JRR Tolkien", "j_tolkien@gmail.com", Author.Gender.M);

        //Create Book
        Book lordOfTheRings = new Book("Lord Of The Rings", jRRTolkien, 49);

        lordOfTheRings.setPrice(39);
        jRRTolkien.setEmail("fantasywriterke1892@yahoo.com"); // thanks for the laugh

        System.out.println(jRRTolkien.getGender());

        // print author with al its parameters
        System.out.println(jRRTolkien.toString());

        // print book with al its parameters, including the authors
        System.out.println(lordOfTheRings.toString());

    }
}
