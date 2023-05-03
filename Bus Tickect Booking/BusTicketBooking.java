
import java.util.Date;
import java.util.Scanner;


interface Bus {
    public void getBus();
}
interface TravelDetails{
    public void getUserSource();
    public void getUserDestination();
    public void getDateOfJourney();
   
}
abstract class UserDetails implements Bus,TravelDetails{
    String name,source,destination,bus1;
    int age,busNum;
    Date date;

    abstract public void getUserDetails();
    abstract public void getBusDetails();

   
}

class Journey extends UserDetails implements TravelDetails,Bus{
    String[] busArray = {"Bus1", "Bus2", "Bus3"};
    int [] priceArray = {1000, 1500, 2000};

@Override
public void getUserDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.println("------------------------");
    System.out.println("Enter Your Name:");
    name = sc.nextLine();
    System.out.println("Enter Your Age:");
    age = sc.nextInt();
    }

    @Override
    public void getUserSource() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("Enter the Source of Travel:");
        source = sc.nextLine();
    }

    @Override
    public void getUserDestination() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("Enter destination of Travel:");
        destination = sc.nextLine();
    }
    @Override
    public void getDateOfJourney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
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
        System.out.println("-----------------------");
        System.out.println("Buses: ");
        for (int i = 0; i <3; i++){
            System.out.println((i+1) + "."+ busArray[i] + ": Rs." + priceArray[i]);
        }
    }

    @Override
    public void getBusDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("Enter Your Bus Choice");
        busNum = sc.nextInt();

        // String bus1;

        switch(busNum){
            case 1:
            bus1 = busArray[0];
            break;

            case 2:
            bus1 = busArray[1];
            break;

            case 3:
            bus1 = busArray[2];
            break;
            
            default:
            System.out.println("Enter correct details");
            break;
        }
        
    }

    public void showFullDetails(){
        System.out.println("-----------------------");
        System.out.println("Booking Completed");
        System.out.println("Source:" + source + " " + "Destination:" + destination);
        System.out.println("Date:" + date);
        System.out.println("Bus Selected:" + bus1);
        System.out.println("Name:" + name +  " " + "Age:" + age);

    }

    @Override
    public void getBusDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBusDetails'");
    }

}

public class BusTicketBooking {

    public static void main(String[] args) {
        int choice = 1;
        Scanner sc = new Scanner(System.in);
        Journey j1 = new Journey();
        System.out.println("...Journey Ticket Booking....");
        while(choice == 1){
        j1.getUserSource();
        j1.getUserDestination();
        j1.getDateOfJourney();
        j1.showBus();
        j1.getBus();
        j1.getUserDetails();
        j1.showFullDetails();
        System.out.println("1.Book another ticket?");
        System.out.println("2.Leave the page!");
        System.out.println("Enter Your choice:");
        choice = sc.nextInt();
        }
    }
}