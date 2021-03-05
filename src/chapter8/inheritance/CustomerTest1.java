package chapter8.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer lee = new Customer("lee");
        Customer gee = new Customer("gee");

        VipCustomer vip = new VipCustomer("kim");

        System.out.println(lee.showCustomerInfo());
        System.out.println(vip.showCustomerInfo());
        System.out.println(gee.showCustomerInfo());


    }

}
