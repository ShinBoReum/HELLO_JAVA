package chpter11.string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String str1 = new String("java");
        System.out.println(System.identityHashCode(str1)); //488970385

        StringBuilder buffer = new StringBuilder(str1);
        System.out.println(System.identityHashCode(buffer)); //1209271652

        buffer.append(" and");
        buffer.append(" android");
        System.out.println(System.identityHashCode(buffer)); //1209271652

        String str2 = buffer.toString();
        System.out.println(str2); //java and android
    }
}
