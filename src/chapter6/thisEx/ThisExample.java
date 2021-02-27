package chapter6.thisEx;

/*
###this 가 하는 일
-자신의 메모리를 가리킴
생성된 인스턴스 스스로를 가리키는 예약어
-생성자에서 다른 생성자를 호출
    public Student() {
        this("이름없음",1);
    }

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }
    this 를 이용하여 다른 생성자를 호출할 때는 그 이전에 어떠한 statement도 사용할 수 없다.
    위와 같이 생성자가 여러개 이고 파라미터만 다른 경우 constructor overloading 이라고 한다.
    예제) CallAnotherConst 참조
-자신의 주소를 반환 함
 public void setYear(int year){
        year = year; //여기서 year는 자신에서 가장 가까운 year. 매개변수로 받은 year임
        this.year = year; //맴버변수 year의 값을 변경하기 위해서는 this 로 구분
   }


 */
class Birthday {
    int day;
    int month;
    int year;

    public void setYear(int year){
        year = year; //여기서 year는 자신에서 가장 가까운 year. 인자로 받은 year임
        this.year = year; //맴버변수 year의 값을 변경하기 위해서는 this 로 구분분
   }

   public void printThis(){
       System.out.println(this);
   }

}
public class ThisExample {
    public static void main(String[] args) {

        Birthday b1 = new Birthday();
        Birthday b2 = new Birthday();

        System.out.println(b1); //두개의 주소값이 같음
        b1.printThis();
    }
}


