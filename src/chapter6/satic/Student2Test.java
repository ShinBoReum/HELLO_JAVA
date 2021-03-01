package chapter6.satic;

public class Student2Test {
    public static void main(String[] args) {
        Student2 studentLee = new Student2();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.getSerialNum());
        System.out.println(studentLee.getStudentName() + " 학번 : " + studentLee.getStudentID());

        Student2 studentSon = new Student2();
        studentSon.setStudentName("손흥민");
        System.out.println(studentSon.getSerialNum());
        System.out.println(studentSon.getStudentName() + " 학번 : " + studentSon.getStudentID());
    }
}
