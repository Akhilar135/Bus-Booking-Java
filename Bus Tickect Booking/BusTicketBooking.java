import java.util.Date;
import java.util.Scanner;


interface BusTicket {
    public void getBus();
    public void userSource();
    public void userDestination();
    public void dateOfJourney();
}
   
abstract class UserDetails implements BusTicket{
    String name,source,destination,busChoice;
    int age,busNum;
    Date date;

    abstract public void userDetails();
    abstract public void busDetails();

   
}

class Journey extends UserDetails {
    String[] busArray = {"Bus1", "Bus2", "Bus3"};

    int[] priceArray = {1000, 1500, 2000};

@Override
public void userDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.println("------------------------");
    System.out.println("Enter Your Name:");
    name = sc.nextLine();
    System.out.println("Enter Your Age:");
    age = sc.nextInt();
    }

    @Override
    public void userSource() {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the Source of Travel:");
        source = sc.nextLine();
    }

    @Override
    public void userDestination() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Destination of Travel:");
        destination = sc.nextLine();
    }
    @Override
    public void dateOfJourney() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Date of Journey:");
        try{
            date = new Date(sc.next());
        }
        catch(Exception e){
        System.out.println("Invalid Date!!!");
        }
        
        
    }

     @Override
    public void getBus() {
       
        System.out.println("Buses: ");
        for (int i = 0; i <3; i++){
            System.out.println((i+1) + "-> Bus: "+ busArray[i] + "-> Tickect Price: ₹" + priceArray[i]);
        }
    }

    @Override
    public void busDetails() {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter Your Bus Choice");
        busNum = sc.nextInt();

       

        if (busNum == 0){
            busChoice = busArray[0];
        }
        else if(busNum == 1){
            busChoice = busArray[1];
            }

         else if(busNum == 2){
                busChoice = busArray[2];
                }
         else{
            System.out.println("Sorry... Bus could not find.");
            System.out.println("Please provide correct details");
         }   
          
            
        }


    public void displayBookingSummary(){

        System.out.println("Successfully booked the ticket");
        System.out.println("***Enjoy your journey***");
        System.out.println("__________________________");

        System.out.println("Booking Summary");

        System.out.println("Source => " + source);
        System.out.println("Destination => " + destination);
        System.out.println("Date: " + date);
        System.out.println("Bus Name: " + busChoice);
        System.out.println("---User Details---");
        System.out.println("Name: " + name +" || " +"Age: " + age);

    }

}

public class BusTicketBooking {

    public static void main(String[] args) {
        int choice = 1;
        Scanner sc = new Scanner(System.in);
        Journey j1 = new Journey();
        System.out.println("...Journey Ticket Booking....");

        while(choice == 1){
        j1.userSource();
        j1.userDestination();
        j1.dateOfJourney();
        j1.getBus();
        j1.busDetails();
        j1.userDetails();
        j1.displayBookingSummary();

        System.out.println("1.Book more tickets");

        System.out.println("2.Leave the page!");

        System.out.println("Select option");
        choice = sc.nextInt();
        }
    }
}
