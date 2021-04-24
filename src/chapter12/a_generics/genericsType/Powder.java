package chapter12.a_generics.genericsType;

public class Powder extends Material{
    public String toString(){
        return "재료는 파우더 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("파우더 재료를 출력합니다.");
    }
}
