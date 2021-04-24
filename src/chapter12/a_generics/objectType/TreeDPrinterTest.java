package chapter12.a_generics.objectType;

public class TreeDPrinterTest {
    public static void main(String[] args) {

        TreeDPrinter printer = new TreeDPrinter();

        printer.setMaterial(new Powder());

        Powder powder = (Powder) printer.getMaterial();
    }
}
