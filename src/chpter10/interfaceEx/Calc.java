package chpter10.interfaceEx;

public interface Calc {
    double PI = 3.14;     //final 로 컴파일 됨.
    int ERROR = -9999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
}
