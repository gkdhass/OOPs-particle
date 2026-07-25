import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TaxiService taxiService = new TaxiService();

        while(true){

            System.out.println("---------Call Taxi Booking System---------");
            System.out.println("1. Add Taxi");
            System.out.println("2. View Bookings");
            System.out.println("3. View Taxi Details");
            System.out.println("4. Exit");

            System.out.println("Enter the Choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter Customer ID: ");
                    int customerId = sc.nextInt();

                    System.out.println("Enter Pickup Point: ");
                    String pickup = sc.next().toUpperCase();

                    System.out.println("Enter Drop Point: ");
                    String drop = sc.next().toUpperCase();

                    System.out.println("Enter Pickup Time: ");
                    int pickupTime = sc.nextInt();

                    taxiService.booking(customerId , pickup , drop , pickupTime);
                    break;
                case 2:
                    System.out.println("View Bookings");
                    break;
                case 3:
                    taxiService.viewTaxiDetails();
                    break;
                case 4:
                    System.out.println("Tanks you");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }


        }
        

    }
}