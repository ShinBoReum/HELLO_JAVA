package chapter6.satic;

public class Student2 {

    private static int serialNum = 1000;
    public String studentName;
    public int studentID;

    public Student2() {
        serialNum++;            //학생이 생성될 때마다 증가
        studentID = serialNum;  //증가된 값을 studentID 에 대입.
    }

    public static int getSerialNum() {
        int i =10; //지역변수 ,메모리: 스택, 함수호출시 생성, 끝나면 없어짐.
        //studentName = "이지원";  //오류발생. 멤버변수, 인스턴스 변수. 인스턴스가 new 될떄 생성. 가비지컬렉터가 메ㄹ모리를 수거할 떄 소멸 아직 생성안됨.메모리: 힙
        return serialNum; //static 변수. 프로그램이 처음 시작할 떄 상수와 함께 데이터 영역에 생성 프로그램이 끝나고 메모리를 해제할 떄 소멸. 메모리: 데이터 영역
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
