package chapter6.satic;

public class Student1Test {
    public static void main(String[] args) {
        Student1 studentLee = new Student1();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.serialNum);
        System.out.println(studentLee.getStudentName() + " 학번 : " + studentLee.getStudentID());

        Student1 studentSon = new Student1();
        studentSon.setStudentName("손흥민");
        System.out.println(studentSon.serialNum);
        System.out.println(studentSon.getStudentName() + " 학번 : " + studentSon.getStudentID());
    }

    /*
    인스턴스를 생성할때 마다 serialNum은 증가
    ststic 변수는 같은 크래스에서 생성된 인스턴스들이 같은 값을 공유 할 수 있음.
     */
}
