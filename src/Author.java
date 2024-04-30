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
        if (this.hashCode() != other.hashCode() || this.getClass() != other.getClass()) {
            return false;
        }
        if (this.secondName != null) {
            if (this.firstName.equals(((Author) other).firstName) && this.secondName.equals(((Author) other).secondName) && this.lastName.equals(((Author) other).lastName)) {
                return true;
            }
        } else {
            if (this.firstName.equals(((Author) other).firstName) && this.lastName.equals(((Author) other).lastName)) {
                return true;
            }
        }
        return this.toString().equals(other.toString());
    }
}
