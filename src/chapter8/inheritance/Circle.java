package chapter8.inheritance;

public class Circle {
    //Point 와 Circle 의 관계는 일반적이고 구체적인 관계가 아니므로 상속으로 사용하지 않고 생성하여 씀.
    Point point; // has-a 관계

    private int x;
    private int y;

    private int radius;

    public Circle(){
        point = new Point();
    }
}
