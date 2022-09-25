package builder.correct;

public class StudentBuilder {
    private String cnp;
    private String name;
    private String email;
    private String phoneNumber;

    public StudentBuilder setCnp(final String cnp) {
        this.cnp = cnp;
        return this;
    }

    public StudentBuilder setName(final String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setEmail(final String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Student build() {
        Student student = new Student();
        student.setCnp(cnp);
        student.setName(name);
        student.setEmail(email);
        student.setPhoneNumber(phoneNumber);

        return student;
    }
}
