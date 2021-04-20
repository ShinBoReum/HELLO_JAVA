package chpter11.string;

public class StringTest {
    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1==str2); //new 로 생성할 경우 두개의 문자열 주소가 다름

        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3==str4); //직접대입의 경우 두개의 주소는 같음

        System.out.println(System.identityHashCode(str1));
        //스트링연결
        str1 = str1.concat(str2);

        System.out.println(str1); //abcabc  str1 이 str2 에 붙은게 아니라 새로운 문자열이 생성된거임. 계속 연결 사용하면 메모리 낭비

        System.out.println(System.identityHashCode(str1)); // 이전 메모리값과 다른 메모리값을 가르키게 됨.








    }
}
