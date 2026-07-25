import java.util.ArrayList;

public class TaxiService {
    ArrayList<Taxi> taxis = new ArrayList<>();

    public TaxiService(){
        for(int i=1; i<=4; i++){
            taxis.add(new Taxi(i));
        }
    }

    public void viewTaxiDetails(){

        for(Taxi taxi : taxis){
            System.out.println("------Taxi Details------");
            System.out.println("Taxi ID: " + taxi.getTaxiId());
            System.out.println("Current Location: " + taxi.getCurrentLocation());
            System.out.println("Free Time: " + taxi.getFreeTime());
            System.out.println("Total Earnings: " + taxi.getTotalEarnings());
        }
    }

    public void booking(int customerId, String pickup, String drop, int pickupTime){

        Customer customer = new Customer(customerId , pickup, drop, pickupTime);

        System.out.println("------Booking Details------");
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Pickup ID: " + customer.getpickup());
        System.out.println("Drop ID: " + customer.getdrop());
        System.out.println("Pickup Time: " + customer.getpickupTime());
    }
 }
