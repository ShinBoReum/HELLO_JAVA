package chapter8.inheritance;

public class Customer {

    protected int customerID;  //상속관계에서 가시성이 있음(패키지가 다르더라도). 접근가능
    protected String customerName;
    protected String customerGrad;
    int bonusPoint;
    double bonusRatio;
    //private int saleRatio; //VIP 만 있으면 되는 기능. 하나의 클래스에 불필요한 기능이 많아짐
    //private int agentID; //VIP 만 있으면 되는 기능. 하나의 클래스에 불필요한 기능이 많아짐

    public Customer(){
        customerGrad = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price){
        if (customerGrad == "SILVER") {
            bonusPoint += price * bonusRatio;
        }
        else if(customerGrad == "VIP"){

        }
        else if(customerGrad == "GOLD"){

        }
        return price;

    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrad + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrad() {
        return customerGrad;
    }

    public void setCustomerGrad(String customerGrad) {
        this.customerGrad = customerGrad;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }
}
