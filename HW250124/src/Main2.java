import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*Предположим, что дан список Book {String title, List<Author> authors} , Author – класс {String fName, String lName}
        Необходимо сформировать map<Author, List<Book>>,  где ключ - автор, а значение список его книг.
        Естественно, если у книги несколько авторов, то книга должна отразиться в списке книг всех авторов данной книги.

         */
public class Main2 {

    public static void main(String[] args) {

        Author author1 = new Author("Bib", "Bib");
        Author author2 = new Author("Bob", "Bob");


        List<Book> book = new ArrayList<>();
        book.add(new Book("BOOK1" , List.of(author1)));
        book.add(new Book("BOOK2" , List.of(author2)));
        book.add(new Book("BOOK3" , List.of(author1,author2)));


        Map<Author, List<Book>> catalogue = Book.catalogueAuthorBookMap(book);
        System.out.println(catalogue);

    }

}
