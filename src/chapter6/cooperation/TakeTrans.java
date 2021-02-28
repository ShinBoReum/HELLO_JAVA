package chapter6.cooperation;

import chapter5.reference.Subject;

public class TakeTrans {
    public static void main(String[] args) {
        Student james = new Student("james", 5000);
        Student tomas = new Student("tomas", 7000);

        Bus bus100 = new Bus(100);
        james.takeBus(bus100);
        james.showInfo();
        bus100.showInfo();

        Subway subway2 = new Subway(2);
        tomas.takeSubway(subway2);
        tomas.showInfo();
        subway2.showInfo();



    }
}
