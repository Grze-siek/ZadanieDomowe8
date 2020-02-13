package firmaszkoleniowa;

public class Leader {
    private String degree;
    private String firstName;
    private String lastName;

    public Leader(String degree, String firstName, String lastName) {
        this.degree = degree;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getDegree() {
        return degree;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
