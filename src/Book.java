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

    public String toString() {
        return "Автор - " + author + " Название - " + title + ". год выхода - " + yearOfPublishing + ".";
    }
}
