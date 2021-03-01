package chapter6.satic;

public class StudentTestRefByClassName {

    public static void main(String[] args) {
        Student1 studentLee = new Student1();
        studentLee.setStudentName("이지원");
        System.out.println(Student1.serialNum);
        System.out.println(studentLee.getStudentName() + " 학번 : " + studentLee.getStudentID());

        Student1 studentSon = new Student1();
        studentSon.setStudentName("손흥민");
        System.out.println(Student1.serialNum);
        System.out.println(studentSon.getStudentName() + " 학번 : " + studentSon.getStudentID());
    }
}
