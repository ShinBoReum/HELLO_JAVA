package chapter6.satic;

public class Student1 {
    public static int serialNum = 1000;
    public String studentName;
    public int studentID;

    public Student1() {
        serialNum++;            //학생이 생성될 때마다 증가
        studentID = serialNum;  //증가된 값을 studentID 에 대입.
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}

