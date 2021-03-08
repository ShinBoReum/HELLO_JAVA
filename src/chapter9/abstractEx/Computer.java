package chapter9.abstractEx;

public abstract class Computer {
    //public void display();  //오류발생
    //public void typing(); //오류발생 Missing method body, or declare abstract.
    /*
      하기 두 메서드는 이 클래스에서 구체적으로 명시하지 않고 구현에 대한 책임을 상속받는 클래스에 위임.
      상속받는 하위 클래스마다 다르게 구현. on/off 는 하위 클래스에서도 공통으로 사용
     */
    public abstract void display();
    public abstract void typing();


    //public abstract int add(int x, int y);

   // public int added(int x, int y) { return x+y;}

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
