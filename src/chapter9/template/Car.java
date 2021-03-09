package chapter9.template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void washCar(){} //구현부가 없음. 하위 클래스에서 필요시 재정의 사용.

    public abstract void wiper();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public final void run(){
        //차가달리는 일련의 시나리오 시동을 키고 운전하고 멈추고 시동끄고.
        startCar();
        drive();
        wiper();
        washCar();
        stop();
        turnOff();
    }
}
