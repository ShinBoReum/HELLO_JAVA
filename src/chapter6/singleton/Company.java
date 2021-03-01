package chapter6.singleton;

public class Company {
    private Company() { } //컴파일러가 기본생성자를 자동으로 생성하지 않도록 외부에서만 변경가능한 private 생성자 생성.

    private static Company instance = new Company(); //유일하게 생성한 인스턴스

    public static Company getInstance() { //외부에서 참조할 수 있도록 public get() 메서드 구현
        if(instance == null) {
            instance = new Company();
        }

        return instance; // 유일하게 생성한 인스턴스 반환
    }


}
