package chapter6.cooperation;
/*
객체의 협업
아래 예제의 takeBus, takeSubway 에서 객체의 협업이 일어남.
버스와 지하철 class 는 태우고 수입이 올라가는 동일한 행위를 반복
Trans 라는 추상클래스로 하나로 모아 관리할 수 있음.
 */
public class Student {
    String studentName;
    int grade;
    int money;

    public Student(String studentName, int money){
        this.studentName = studentName;
        this.money = money;
    }

    //행위
    public void takeBus(Bus bus) {
        bus.take(1000);
        money -=1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1500);
        money -=1500;
    }

    public void showInfo() {
        System.out.println(studentName + "의");
    }
}
