package chpter10.interfaceEx;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();

        Sell seller =customer;
        seller.sell();

        customer.buy();
        customer.sell();

        //customer 가 어싸인 됬기떄문에 3개 모두 customer 의 order가 불림
        seller.order();
        buyer.order();
        customer.order();
    }
}
