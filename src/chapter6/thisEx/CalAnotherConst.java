package chapter6.thisEx;

class Person{
    String name;
    int age;

    public Person() {
       // name = "test";
    /*
        에러발생
        Call to 'this()' must be first statement in constructor body
        생성자에서 다른 생성자를 호출하는 this 문을 작성할때는 this 앞에 다른 선언이 올수 없음
        name 은 Person(name,int)이라는 생성자가 호출되어야 생성되는 인스턴스.
        Person이 호출되기 전에 값을 assign 하면 생성되지 않은 메모리에
        값을 assign 하는 등의 오류가 발생할수 있음.

     */
        this("이름없음",1);

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person returnSelf(){
        return this;
    }
}
public class CalAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name); //이름없음

        p1.returnSelf();//this 자기 자신의 주소값 반환
    }
}
