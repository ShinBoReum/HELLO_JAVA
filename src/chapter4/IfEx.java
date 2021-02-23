package chapter4;

public class IfEx {
    public static void main(String[] args) {

        //if문
        int age = 2;

        if(age >= 8) {
            System.out.println("학교에다닙니다.");
        }else {
            System.out.println("학교에 다니지 않습니다.");
        }

        int age2 = 9;
        int charge = 0;

        if(age <8 ){
            charge =1000;
        }
        else if(age <14) {
            charge =2000;
        }
        else if(age < 20) {
            charge =2500;
        }
        else {
            charge = 3000;
        }
        System.out.println("입장료는 " + charge + "원 입니다.");

        //switch문
        int rank = 1;
        String medalColor;
        switch (rank) {
            case 1: medalColor = "G";
                break; //break 미사용시 하위까지 수행 1이 더라도 S
            case 2: medalColor = "S";
                break;
            case 3: medalColor = "B";
                break;
            default: medalColor = "A";
        }
        System.out.println(rank + "등 메달의 색깔은 " + medalColor + "입니다.");

        int month = 10;
        int day;

        switch (month) {
            case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
                day =31;
                break;
            case 2 :
                day =28;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            default:
                day =0;
                break;
        }
        System.out.println(month + "월은 " + day + "일 까지 있습니다.");
    }


}
