package chpter11.object;

class Student {
    int studentID;
    String studentName;

    Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public boolean equals(Object obj){
        if(obj instanceof Student) {
            Student std = (Student)obj;
            if(studentID == std.studentID) return true;
            else return false;
        }
        return false;
    }

    public int hashCode() {
        return studentID;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        String str1 = new String("test");
        String str2 = new String("test");

        System.out.println(str1 == str2); //false 두개의 주소가 같냐? 아님 ,물리적 동일성
        System.out.println(str1.equals(str2)); //ture 두개의 문자열이 같냐? 같음, 논리적 동일성

        Student student1 = new Student(10001, "Tomas");
        Student student2 = new Student(10001, "Tomas");

        System.out.println(student1 == student2);  //false
        System.out.println(student1.equals(student2)); //false. equals의 원형은 ==
        //equals method 재정의 후 ture!

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());  //두 학생의 해시코드 값이 다름.
        //hashCode 재정의 후 같음

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode()); // 두 스트링의 힙메모리 값이 다른데 해시코드 값이 같음.해시코드가 재정의 됬기 때문

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2)); //두개의 십진코드가 다름름
    }
}

