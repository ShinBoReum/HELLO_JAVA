package chapter6.singleton;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();
        System.out.println( c1 == c2); // true 두 변수가 같은 주소값.

        //Company c3 = new Company(); //error 싱글톤 패턴은 new 할수 없음.

        Calendar cal = Calendar.getInstance(); // 생성자가 없는 싱글톤 패턴
    }
}
