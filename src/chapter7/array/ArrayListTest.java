package chapter7.array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        for (String a : list){
            System.out.println(a);
        }
        //제네릭을 String으로 명시하지 않으면 자바의 최상위 타입 Object로 생성됨. 캐스팅 필요.
    }
}
