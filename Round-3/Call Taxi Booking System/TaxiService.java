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

    public void booking(int customerId, char pickup, char drop, int pickupTime){

        Customer customer = new Customer(customerId , pickup, drop, pickupTime);

        System.out.println("------Booking Details------");
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Pickup ID: " + customer.getpickup());
        System.out.println("Drop ID: " + customer.getdrop());
        System.out.println("Pickup Time: " + customer.getpickupTime());

        Taxi avalible_id = null;
        int minDistance = Integer.MAX_VALUE;

        for(Taxi taxi : taxis){
            if(taxi.getFreeTime() <= pickupTime){
                int distance = Math.abs(taxi.getCurrentLocation() - pickup);

                if(distance < minDistance){
                    minDistance = distance;
                    avalible_id = taxi;
                }
            }
        }

        
        if(avalible_id == null){
            System.err.println("\n No Taxi Avalible.");
        }
        else{
            System.err.println("Taxi Avalible");
            System.err.println("Taxi ID: " + avalible_id.getTaxiId());
        }
    }
 }
