package chapter12.a_generics.genericsType;

public class TreeDPrinterTest {
    public static void main(String[] args) {

        TreeDPrinter<Powder> printer = new TreeDPrinter<>();

        printer.setMaterial(new Powder());

        Powder powder = printer.getMaterial();
        System.out.println(printer);

        TreeDPrinter<Plastic> printer2 = new TreeDPrinter<>();
        printer2.setMaterial(new Plastic());
        Plastic plastic = printer2.getMaterial();
        System.out.println(printer2);
        printer2.printing();

         /*
        제네릭 사용시 모든 객체 가능. 물은 허용되지 않는 재료지만 컴파일상 문제는 없음.
        상위클래스 Material 을 만들어고 Material 을 상속받은 객체로 제한을 둠.
        Material 을 상속 받지 않은 물은 에러 발생.
         */
//        TreeDPrinter<Water> waterTreeDPrinter = new TreeDPrinter<Water>();
//        waterTreeDPrinter.setMaterial(new Water());
//        System.out.println(waterTreeDPrinter);

    }
}
