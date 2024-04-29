
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


    public String toString() {

        if (secondName == null) {
            return this.firstName + " " + lastName + ".";
        } else {
            return this.firstName + " " + this.secondName + " " + lastName + ". ";
        }
    }

    public int hashCode() {
        int resultHashCode = firstName.hashCode();
        resultHashCode += lastName.hashCode() * 29;
        return resultHashCode;
    }

    public boolean equals(Author a) {
        if (firstName == null || lastName == null) {
            return false;
        }
        if (this.firstName == a.firstName && this.lastName == a.lastName) {
            return true;
        } else if (this.firstName == a.firstName && this.secondName == a.secondName && this.lastName == a.lastName) {
            return true;
        }
        return false;
    }

}

