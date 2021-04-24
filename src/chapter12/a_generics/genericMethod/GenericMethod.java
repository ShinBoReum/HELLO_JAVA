package chapter12.a_generics.genericMethod;

/*
사각형의 너비를 구하는 메서드
두 점의 위치가 여러 자료형으로 사용되는 경우
 */
public class GenericMethod {
    public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
        double left = ((Number)p1.getX()).doubleValue();
        double right = ((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();

        double width = right - left;
        double height = bottom - top;

        return width * height;
    }
}
