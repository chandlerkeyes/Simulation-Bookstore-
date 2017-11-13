import java.util.ArrayList;
import java.util.PriorityQueue;

public class MarketPlace {
    private final int OPEN = 600;
    private final int CLOSE = 1080;
    private double avgTimeBtwnCustomers;
    private double avgCashierServTime;
    private int numOfCashiers;
    private boolean displayCheckout;
    private GVrandom arrivalAndServTimes;
    private double currentSimTime;
    private Customer[] cashier;
    private ArrayList <Customer> customersInLine;
    private PriorityQueue<GVevent> futureEvents;
    private String results;

    public MarketPlace() {
        customersInLine = new ArrayList<Customer>();
        futureEvents = new PriorityQueue <GVevent> ();
        cashier = new Customer[numOfCashiers];
        arrivalAndServTimes = new GVrandom();
        numOfCashiers = 3;
        avgCashierServTime = 6.6;
        //avg arrival time
        avgTimeBtwnCustomers = 2.5;
    }
    

}
