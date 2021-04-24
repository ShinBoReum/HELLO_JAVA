package chapter12.a_generics.genericsType;

public class Plastic extends Material{
    public String toString(){
        return "재료는 플라스틱 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("플라스틱 재료를 출력합니다.");
    }
}
