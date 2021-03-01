package chapter6.satic;

public class Student {
    public static int serialNum = 1000;
    public String studentName;
    public int studentID;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


}
