package chapter8.polymorphism.withArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer lee = new Customer("lee");
        Customer shin = new Customer("Shin");
        GoldCustomer kim = new GoldCustomer("kim");
        GoldCustomer gee = new GoldCustomer("Gee");
        VipCustomer goo = new VipCustomer("Goo" ,12345);

        customerList.add(lee);
        customerList.add(shin);
        customerList.add(kim);
        customerList.add(gee);
        customerList.add(goo);

        System.out.println("========고객정보 출력=========");

        for(Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("========할인율과 보너스 포인트 결과=========");

        int price = 100000;
        for(Customer customer : customerList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불");
            System.out.println(customer.showCustomerInfo());
        }
    }
}
