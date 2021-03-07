package chapter8.polymorphism.withArrayList;


public class GoldCustomer extends Customer {
    private double saleRatio;

    public GoldCustomer(String customerName) {
        super(customerName);
        customerGrad = "Gold";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint +=price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
