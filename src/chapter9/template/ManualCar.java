package chapter9.template;

public class ManualCar extends Car {

    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크로 정지합니다.");
    }

    @Override
    public void wiper() {
        System.out.println("사람이 와이퍼를 조작합니다.");
    }

    //public void run(){ } //오류남 final은 재정의할 수 없음.
}
