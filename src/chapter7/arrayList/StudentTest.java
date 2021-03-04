package chapter7.arrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student lee = new Student(1001,"lee");
        lee.addSubject("국어", 80);
        lee.addSubject("수학", 80);

        lee.showStudentInfo();

        System.out.println("=============");

        Student kim = new Student(1002, "kim");
        kim.addSubject("국어", 70);
        kim.addSubject("수학", 60);
        kim.addSubject("영어", 90);

        kim.showStudentInfo();
    }
}
