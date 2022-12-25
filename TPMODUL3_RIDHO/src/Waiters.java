public class Waiters implements Runnable {
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 25000;

    public Waiters(int customerID, int orderQty) {
        this.orderQty = orderQty;
        this.customerID = customerID;
    }

    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("\n===== ORDER INFO =====");
        System.out.println("Customer ID : "+customerID);
        System.out.println("Number of Food : "+orderQty);
        System.out.println("Total Price : "+(orderQty*foodPrice));
        System.out.println("======================");
    }

    public void getFood() {
        synchronized(Restaurant.getLock()){
            System.out.println("Waiter : Food is ready to deliver");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);

            if (restaurant.getFoodNumber() == orderQty+1) {
                orderInfo();
                System.exit(0);
            }else{
                restaurant.getLock().notifyAll();
                System.out.println("Waiter : Tell the restaurant to make another food\n");
            }
        }
    }
}
