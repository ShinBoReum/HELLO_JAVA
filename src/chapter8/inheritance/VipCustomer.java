package chapter8.inheritance;

import java.security.PublicKey;

public class VipCustomer extends Customer{
    private double saleRatio; //VIP 만 있으면 되는 기능. 하나의 클래스에 불필요한 기능이 많아짐
    private int agentID; //VIP 만 있으면 되는 기능. 하나의 클래스에 불필요한 기능이 많아짐

    public VipCustomer(String customerName){
        super(customerName);
        customerGrad = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }
}
