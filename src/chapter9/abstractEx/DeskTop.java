package chapter9.abstractEx;

import jdk.swing.interop.SwingInterOpUtils;

public class DeskTop extends Computer {
    @Override
    public void display() {
        System.out.println("DaskTop display()");
    }

    @Override
    public void typing() {
        System.out.println("DaskTop typing()");
    }

    public void turnOff() {
        System.out.println("DskTop off");
    }
}
