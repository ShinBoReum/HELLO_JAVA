package chapter6.satic;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.getStudentName()); //이지원
        studentLee.serialNum++;

        Student studentSon = new Student();
        studentSon.setStudentName("손흥민");
        System.out.println(studentSon.serialNum);  //1001
        System.out.println(studentLee.serialNum);  //1001 두값이 동일. static 변수는 모든 인스턴스가 공유하기 때문.
    }
}
