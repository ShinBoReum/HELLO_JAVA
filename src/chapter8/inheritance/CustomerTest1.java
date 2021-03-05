package chapter8.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer lee = new Customer();
        lee.setCustomerID(10001);
        lee.setCustomerName("lee");

        VipCustomer vip = new VipCustomer();
        vip.setCustomerID(10001);
        vip.setCustomerName("kim");

        System.out.println(lee.showCustomerInfo());
        System.out.println(vip.showCustomerInfo());


    }

}
