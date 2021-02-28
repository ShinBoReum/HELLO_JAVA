package chapter6.cooperation;

public class Subway {
    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        passengerCount++;
        this.money += money;
    }

    public void showInfo() {
        System.out.println(lineNumber + "번 지하철의 현재 승객은 "
                + passengerCount + "명이고, 수입은 " + money + "원 입니다."
        );
    }
}
