package chapter3;

public class ExplicitConversion {
    public static void main(String[] args){
        int iNum =1000;
        byte bNum = (byte)iNum; //-24 데이터 유실로 인한 음수값

        double dNum = 3.14;
        iNum = (int)dNum; //3 소숫점 이하 유실
        float fNum = 0.9F;

        int num1 =(int)dNum + (int)fNum;  //3 3+0 =3
        int num2 = (int)(dNum+fNum);  //4 3.14 + 0.9= 4.23
    }



}
