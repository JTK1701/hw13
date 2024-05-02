import java.util.Objects;

public class Author {
    private String firstName;
    private String secondName;
    private String lastName;

    public Author(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {

        if (secondName == null) {
            return this.firstName + " " + lastName + ".";
        } else {
            return this.firstName + " " + this.secondName + " " + lastName + ". ";
        }
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.toString());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other || other == null || this.hashCode() != other.hashCode() || this.getClass() != other.getClass()) {
            return false;
        }
        return  Objects.equals(this.firstName, ((Author) other).firstName) && Objects.equals(this.secondName, ((Author) other).secondName) && Objects.equals(this.lastName, ((Author) other).lastName);
    }
}
