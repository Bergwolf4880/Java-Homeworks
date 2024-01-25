import java.util.*;

public class Book {

    private String title;

    List<Author> authors;

    public Book(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public static Map<Author, List<Book>> catalogueAuthorBookMap(List<Book> books) {
        Map<Author, List<Book>> authorBookMap = new HashMap<>();
        for (Book book : books) {
            for (Author author : book.authors) {
                authorBookMap.computeIfAbsent(author, (Author a) -> new ArrayList<>()).add(book);
            }
        }
        return authorBookMap;
    }

    @Override
    public String toString() {
        return "Book|" + title + '|' +
                ", Authors=" + authors +
                '|';
    }
}
