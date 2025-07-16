package ScenarioBasedQuestions;
import java.util.*;

public class BookShelf {
    HashMap<String, LinkedList<String>> genreCatalog = new HashMap<>();

    void addBook(String genre, String book) {
        genreCatalog.putIfAbsent(genre, new LinkedList<>());
        if (!genreCatalog.get(genre).contains(book)) {
            genreCatalog.get(genre).add(book);
        }
    }

    void removeBook(String genre, String book) {
        LinkedList<String> books = genreCatalog.get(genre);
        if (books != null) books.remove(book);
    }

    void printCatalog() {
        for (String genre : genreCatalog.keySet()) {
            System.out.println(genre + ": " + genreCatalog.get(genre));
        }
    }

    public static void main(String[] args) {
        BookShelf lib = new BookShelf();
        lib.addBook("Fiction", "1984");
        lib.addBook("Fiction", "Animal Farm");
        lib.addBook("Sci-Fi", "Dune");
        lib.removeBook("Fiction", "1984");
        lib.printCatalog();
    }
}
