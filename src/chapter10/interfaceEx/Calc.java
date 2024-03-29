package chapter10.interfaceEx;

public interface Calc {
    double PI = 3.14;     //final 로 컴파일 됨.
    int ERROR = -9999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    //디폴트 메서드
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod(); //디폴트 메서드에서 private 메서드 호출
    }

    //정적메서드
    static int total(int[] arr){
        int total = 0;
        for(int i : arr){
            total += i;
        }
        myStaticMethod(); //정적 메서드에서 private static 메서드 호출
        return total;
    }

    //private 메서드
    private void myMethod() {
        System.out.println("private 메서드입니다."); //private 메서드
    }

    private static void myStaticMethod() {
        System.out.println("private static 메서드입니다."); //private static 메서드
    }

}
