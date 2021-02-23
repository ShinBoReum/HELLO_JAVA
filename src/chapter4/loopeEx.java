package chapter4;

public class loopeEx {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

        while (num <1) {  //조건이 맞지않으면 수행안됨
            sum += num;
            num++;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다."); //0

        do { //항상 1번은 수행
            sum += num;
            num++;
        }while (num <= 10);

        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");//55

        //do while
        do { //항상 1번은 수행
            sum += num;
            num++;
        }while (num < 1);

        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");//1

        //for문
        int num2 =1;
        int sum2 =0;
        for (num2=1; num2 <=10; num2++) {
            sum2 +=num2;
        }
        System.out.println(sum2);
        System.out.println(num2);

        //중첩
        int dan;
        int times;

        for(dan=2; dan<=9; dan++){
            for (times =1; times<=9; times++){
                System.out.println(dan + "x" + times + "=" + dan*times);
            }
            System.out.println(); //개행
        }


        //countinue문
        int total = 0;
        int num3;
        for(num3 =1; num3 <= 100; num3++){ //100까지 반복
            if(num3 % 2 == 0)              //num3 값이 짝수인 경우
                continue;                  //이후 수행을 생략하고 num3++수향
            total +=num3;                  //num3 값이 홀수인 경우에만 수행
        }
        System.out.println("1부터 100까지의 홀수의 합은: " + total + "입니다.");

        //break문
        int bSum = 0;
        int bNum = 1;

        while(bSum < 100) {
            bSum += bNum;
            if(bSum >100)
                break; //100을 넘는 순간의 num값을 알수 있음
            num++;
        }
    }
}
