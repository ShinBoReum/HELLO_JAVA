package chapter5;
/*
인스턴스와 힙(heap)메모리
하나의 클래스 코드로 부터 여러 개의 인스턴스를 생성
인스턴스는 힙(Heap) 메모리에 생성됨
각각의 인스턴스는 다른 메모리에 다른 값을 가짐
Heap : 동적으로 생성되는 부분. 동적메모리 공간
new 라는 키워드로 생성됨. 가비지콜렉터에 의해 없어짐.
    int studentID;
    String studentName;
    int grade;
    String address;
StudentLee 에서 heap 공간에 생성되는 자료들
Stack: 힙메모르의 주소를 가르킴. 주소값
함수가 호출되면 지역변수가 쌓임. 함수가 끝나면 없어짐

 */
public class StudentTest {
    public static void main(String[] args) {
        //instance studentLee
        Student studentLee = new Student(100, "이순신"); //Student: 참조타입 studentLee: 참조변수
        studentLee.studentName = "이순신";
        studentLee.address = "서울시 서로구 서초동";

        //instance studentKim
        Student studentKim = new Student();
        studentKim.studentName = "김유신";
        studentKim.address = "서울시 구로구 계포동";

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        System.out.println(studentLee); //주소값 출력
        System.out.println(studentLee);

    }
}