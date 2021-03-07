package chapter8.polymorphism.withArrayList;


public class VipCustomer extends Customer  {
    private double saleRatio; //VIP 만 있으면 되는 기능. 하나의 클래스에 불필요한 기능이 많아짐
    private int agentID; //VIP 만 있으면 되는 기능. 하나의 클래스에 불필요한 기능이 많아짐

    public VipCustomer(String customerName){
        super(customerName);
        customerGrad = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.2;
    }
    public VipCustomer(String customerName, int agentID){
        super(customerName);
        customerGrad = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }


    public int getAgentID() {
        return agentID;
    }

    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당상담원 아이디는 " + agentID + "입니다.";
    }
}
