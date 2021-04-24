package chapter11.object;

class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Circle implements Cloneable {
    Point point;
    private int radius;

    public Circle(int x, int y, int radius) {
        point = new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ObjectCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(10,20,5);
        Circle cloneCircle = (Circle)circle.clone();

        System.out.println(System.identityHashCode(circle));
        System.out.println(System.identityHashCode(cloneCircle)); //implements cloneable 없으면 에러남
        System.out.println(circle);
        System.out.println(cloneCircle);
    }
}
