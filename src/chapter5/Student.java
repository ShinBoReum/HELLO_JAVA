package chapter5;
public class Student {
    //학생의 속성을 정의
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student(){}
    public Student(int id, String name) {
        studentID = id;
        studentName = name;

    }  //생성자가 하나도 없을 경우 컴파일러가 자동 생성. 하나라도 있으면 자동 생성하지 않음
    //생성자는 이 객체를 생성하면서 반드시 수행되야할것을 명시.

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