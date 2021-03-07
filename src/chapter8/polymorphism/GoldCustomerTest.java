package chapter8.polymorphism;

import chapter8.inheritance.Customer;

import java.util.ArrayList;

public class GoldCustomerTest {
    public static void main(String[] args) {
        Customer gold = new GoldCustomer("Gold");
        System.out.println(gold.calcPrice(10000));


        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Human());
        animals.add(new Tiger());
        animals.add(new Eagle());

        System.out.println(animals);
    }
}
