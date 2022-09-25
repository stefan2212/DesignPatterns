package builder.wrong;

public class Student {
    private String cnp;
    private String name;
    private String email;
    private String phoneNumber;

    public Student() {
    }

    public Student(final String cnp, final String name, final String email, final String phoneNumber) {
        this.cnp = cnp;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Student(final String cnp, final String name, final String phoneNumber) {
        this.cnp = cnp;
        this.name = name;
        this.phoneNumber = phoneNumber;
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
}
