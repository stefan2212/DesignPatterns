package builder.lazy;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .phoneNumber("12312")
                .email("email")
                .name("name")
                .cnp("12321")
                .build();
        System.out.println(student);
    }
}
