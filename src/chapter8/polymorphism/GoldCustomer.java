package chapter8.polymorphism;

import chapter8.inheritance.Customer;

public class GoldCustomer extends Customer {
    private double saleRatio; //VIP 만 있으면 되는 기능. 하나의 클래스에 불필요한 기능이 많아짐
    private String agentID; //VIP 만 있으면 되는 기능. 하나의 클래스에 불필요한 기능이 많아짐

    public GoldCustomer(String customerName) {
        super(customerName);
        customerGrad = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.2;
        agentID = "G";
    }

    @Override
    public int calcPrice(int price) {
        return price - (int)(price * saleRatio);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
