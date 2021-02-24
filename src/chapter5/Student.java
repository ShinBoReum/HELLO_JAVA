package chapter5;
public class Student {
    //학생의 속성을 정의
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo(){
        System.out.println(studentName + "," + address);
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }

}