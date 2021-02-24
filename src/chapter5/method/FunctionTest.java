package chapter5.method;
/*
### 메서드
        함수의 일종
        객체의 기능을 제공하기 위해 클래스 내부에 구현되는 함수
        함수란?
        하나의 기능을 수행하는 일련의 코드
        중복되는 기능은 함수로 구현하여 함수를 호출하여 사용함

        -함수정의하기
        함수를 코드로 구현
        함수의 이름, 매개변수, 반환 값을 선언하고 코드를 구현함

        -함수를 왜 쓰나?
        코드를 기능별로 효율적으로 구현,관리하기 위해
 */
public class FunctionTest {
    public static void main(String[] args) {
        int num1 =10;
        int num2 =30;

        int sum = addNum(num1,num2);
        System.out.println(sum);
    }

    public static int addNum(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
}
