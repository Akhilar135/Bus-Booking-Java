import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


interface BusTicket {
    public void getBus();
    public void userSource();
    public void userDestination();
    public void dateOfJourney();
}
   
abstract class UserDetails implements BusTicket{
    String name,source,destination,busChoice;
    int age,busNum,busChoicePrice;
    Date date;

    abstract public void userDetails();
    abstract public void busDetails();

   
}

class Journey extends UserDetails {
   // String[] busArray = {"Bus1", "Bus2", "Bus3"};
   //int[] priceArray = {1000, 1500, 2000};

  // Map<String, Integer> busListMap = new HashMap<>();
  ArrayList<Bus> busList = new ArrayList<Bus>();

 


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

        busList.add(new Bus("Krishna Travels",2500,1));
        busList.add(new Bus("MFA Travels",2700,2));
        busList.add(new Bus("Mumbai Travels",3000,3));
        System.out.println(busList);


        // busListMap.put("Bus1", 2500);
        // busListMap.put(Bus2", 2700);
        // busListMap.put("Bus3", 2800);

        // System.out.println(busListMap.keySet());

        // for(String busN: busListMap.keySet()){
        //     System.out.println(busN+" -->  "+busListMap.get(busN));

        // }
       
        // for (int i = 0; i <3; i++){
        // Object firstKey = busListMap.keySet().toArray()[i];
        // Object valueForFirstKey = busListMap.get(firstKey);
        // System.out.println(busListMap.get(valueForFirstKey));
        // System.out.println("Buses: ");
        // for (int i = 0; i <3; i++){
        //     System.out.println((i+1) + "-> Bus: "+ busArray[i] + "-> Tickect Price: ₹" + priceArray[i]);
        // }
    }


    @Override
    public void busDetails()  {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter Your Bus Choice");
        busNum = sc.nextInt();
        // busChoice="Bus "+busNum;
         if(busNum>busList.size() || busNum<=0 ){
        System.out.println("invalid ");
            throw new IndexOutOfBoundsException("invalid");
            
          }else{
         busChoice= busList.get(busNum-1).busName;
         busChoicePrice=busList.get(busNum-1).price;
         }
       // try{
            
            //busChoice= busList.get(busNum).busName;
       // }
        // catch(Exception e){
        // System.out.println("Invalid !!!");
        // }
        //egnSystem.out.println(busList.indexOf(busList.get(busNum)));
        // if (busNum == 0){
        //     busChoice = "Bus1";
        // }
        // else if(busNum == 1){
        //     busChoice = busArray[1];
        //     }

        //  else if(busNum == 2){
        //         busChoice = busArray[2];
        //         }
        //  else{
        //     System.out.println("Sorry... Bus could not find.");
        //     System.out.println("Please provide correct details");
        //  }   
          
            
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
        System.out.println("Bus Price: " + busChoicePrice);
        System.out.println("---User Details---");
        System.out.println("Name: " + name +" || " +"Age: " + age);

    }

}

public class BusTicketBooking {

    public static void main(String[] args) {
        int option = 1;
        Scanner sc = new Scanner(System.in);
        Journey j1 = new Journey();
        System.out.println("...Journey Ticket Booking....");

        while(option == 1){
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
        option = sc.nextInt();
        }
    }
}
