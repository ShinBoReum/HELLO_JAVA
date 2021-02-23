package chapter3;

public class OperationEx {
    public static void main(String[] args) {
        int age =24;  //24

        int num =10;  //10
        int num2= -num; //-10

        ++num; //11 감소먼저
        num++; //10 문장이 끝나고 감소
        System.out.println(num--); //10
        System.out.println(num); //9

        //관계 연산자
        boolean flag = num<num2;

        //단락 회로 평가
        boolean value = ((num =num +10) <10) && ((num2=num2+2) >10);
        //앞항이 false 뒷 항은 연산 하지 않음 결과 false

        //복합대입 연산자
        int num3 = 10;
        System.out.println(num3 += 1); //11
        System.out.println(num3 %= 10); //1
        num3 -=1; //num3 = num3 -1  //0

        //조건연산자
        int num4 = (5>3)? 10:20;
        System.out.println(num4); //10

        num4 = (5<3)? 10:20;
        System.out.println(num4); //20

        //비트연산자


    }
}
