import java.util.Objects;

public class Book {
    private int yearOfPublishing;
    private Author author;
    private String title;

    public Book(int yearOfPublishing, Author author, String title) {
        this.yearOfPublishing = yearOfPublishing;
        this.title = title;
        this.author = author;
    }


    public String getTitle() {
        return this.title;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Автор - " + author + " Название - " + title + ". год выхода - " + yearOfPublishing + ".";
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(yearOfPublishing, author, title);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other || other == null || this.hashCode() != other.hashCode() || this.getClass() != other.getClass()) {
            return false;
        }
        return Objects.equals(this.yearOfPublishing, ((Book) other).yearOfPublishing) && Objects.equals(this.author, ((Book) other).author)&&Objects.equals(this.title, ((Book) other).title);
    }

}
