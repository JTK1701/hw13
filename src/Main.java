import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Сергей", "Лукьяненко");
        Author author2 = new Author("Clifford", "Simak");
        Author author3 = new Author("John", "R. R.", "Tolkien");
        Author author4 = new Author("Сергей", "Лукьяненко");
        Author author5 = new Author("Clifford", "Simak");
        Book book1 = new Book(2020, author1, "Л - Значит люди");
        Book book2 = new Book(1963, author2, "Way Station");
        Book book3 = new Book(1954, author3, "The Two Towers");
        Book book4 = new Book(2014, author4, "Черновик");
        Book book5 = new Book(1963, author2, "Way Station");
        book1.setYearOfPublishing(1999);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println("author1.hashCode() = " + author1.hashCode());
        System.out.println("author2.hashCode() = " + author2.hashCode());
        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("author1.equals(author2) = " + author1.equals(author2));
        System.out.println("author1.equals(author1) = " + author1.equals(author1));
        System.out.println("author1.equals(author4) = " + author1.equals(author4));
        System.out.println("book4.equals(book1) = " + book4.equals(book1));
        System.out.println("book2.equals(book5) = " + book2.equals(book5));
        System.out.println("book2.hashCode() = " + book2.hashCode());
        System.out.println("book5.hashCode() = " + book5.hashCode());
        if (book2.hashCode() == book5.hashCode()) {
            System.out.println("вторая книга и пятая - одинаковые.");
        } else {
            System.out.println("вторая книга и пятая - разные.");
        }
        if (book1.hashCode() == book5.hashCode()) {
            System.out.println("первая книга и пятая - одинаковые.");
        } else {
            System.out.println("первая книга и пятая - разные.");
        }
    }
}
