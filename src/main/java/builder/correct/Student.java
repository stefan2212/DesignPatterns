package builder.correct;

public class Student {
    private String cnp;
    private String name;
    private String email;
    private String phoneNumber;

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(final String cnp) {
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cnp='" + cnp + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
