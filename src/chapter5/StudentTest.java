package chapter5;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentName = "이순신";
        student.address = "서울시 서로구 서초동";

        student.showStudentInfo();

    }
}