package ss5_access_modifier.bai_tap.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setClasses("C02");
        System.out.println(student.toString());
    }
}
