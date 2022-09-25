package builder.correct;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .setPhoneNumber("0755")
                .setName("Stefan")
                .setCnp("194")
                .build();
        System.out.println(student);
    }
}
