package chapter8.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer lee = new Customer("lee");
        Customer gee = new Customer("gee");

        VipCustomer vip = new VipCustomer("kim");

        System.out.println(lee.showCustomerInfo());
        System.out.println(vip.showCustomerInfo());
        System.out.println(gee.showCustomerInfo());

        int charge = 10000;

        System.out.println( lee.getCustomerName() + "님의 요금은 " + lee.calcPrice(charge) +"원 입니다.");
        System.out.println( vip.getCustomerName() + "님의 요금은 " + vip.calcPrice(charge) +"원 입니다.");

        Customer kim = new VipCustomer("kim");
        System.out.println( kim.getCustomerName() + "님의 요금은 " + kim.calcPrice(charge) +"원 입니다.");

    }

}
