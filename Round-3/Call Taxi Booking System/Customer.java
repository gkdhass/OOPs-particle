public class Customer{

    private int customerId;
    private String pickup;
    private String drop;
    private int pickupTime;

    public Customer(int customerId, String pickup, String drop, int pickupTime){
        this.customerId = customerId;
        this.pickup = pickup;
        this.drop = drop;
        this.pickupTime = pickupTime;
    }

    public int getCustomerId(){
        return customerId;
    }

    public String getpickup(){
        return pickup;
    }

    public String getdrop(){
        return drop;
    }

    public int getpickupTime(){
        return pickupTime;
    }
}