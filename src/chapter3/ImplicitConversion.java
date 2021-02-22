package chapter3;

import org.w3c.dom.ls.LSOutput;

public class ImplicitConversion {
    public static void main(String[] args){
        byte bNum= 10;
        int num = bNum; //10

        long lNum = 10;
        float fNum = lNum; //10.0

        double dNum = fNum + num; //20.0
    }


}
