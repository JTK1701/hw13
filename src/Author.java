
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
}