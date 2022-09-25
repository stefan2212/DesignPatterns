package builder.wrong;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("194", "Stefan", "stefan@gmail.com", "075");

        Student student1 = new Student();
        student1.setCnp("194");
        student1.setName("Alex");
        student1.setPhoneNumber("0777");
    }
}
