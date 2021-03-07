package chapter8.polymorphism;

class Animal {
    public void movie() {
        System.out.println("동물이 움직입니다.");
    }


}

class Human extends Animal {
    public void movie() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void movie() {
        System.out.println("호랑이가 네발로 뜁니다. ");
    }

    public void hunting() {
        System.out.println("사냥을 합니다.");
    }
}

class Eagle extends Animal {
    public void movie() {
        System.out.println("독수리가 하늘을 납니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.movieAnimal(new Human());
        test.movieAnimal(new Tiger());
        test.movieAnimal(new Eagle());


    }


    private void movieAnimal(Animal animal) {
        animal.movie();  //다형성!! 매개변수로 넘어온 실제 인스턴스의 메서드가 호출. 넘어온 인스턴스에 따라 다른 출력문.
        if( animal instanceof Human){
            Human human = (Human)animal;
            human.readBook();
        }
        if( animal instanceof Tiger){
            Tiger tiger = (Tiger)animal;
            tiger.hunting();
        }


    }
}

