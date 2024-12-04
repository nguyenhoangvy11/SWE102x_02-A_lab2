package Strategy.order;

import Strategy.strategies.PayStrategy;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy){
        strategy.collectionPaymentDetails();
    }

    public void setTotalCost(int cost){
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return this.totalCost;
    }

    public boolean isClosed(){
        return this.isClosed;
    }

    public void setClosed(){
        this.isClosed = true;
    }
}
