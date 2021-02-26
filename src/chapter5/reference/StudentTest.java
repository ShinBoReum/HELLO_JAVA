package chapter5.reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentJames = new Student(100,"James");
        studentJames.setKorea("국어", 100);
        studentJames.setMath("수학", 60);

        Student studentTomas = new Student(101,"Tomas");
        studentJames.setKorea("국어", 80);
        studentJames.setMath("수학", 70);

        studentJames.showStudentInfo();
        studentTomas.showStudentInfo();
    }
}
