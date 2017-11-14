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
    public int getNumCashiers() {
        return numOfCashiers;
    }
    public double getArrivalTime() {
        return avgTimeBtwnCustomers;
    }
    public double getServiceTime() {
        return avgCashierServTime;
    }
    //FIXME: Figure out how to return # of customers served
    public int getNumCustomersServed() {
        return customersInLine.size();
    }
    public String getReport() {
        //FIXME: Return a report of results (toString)
        results = "";
        return results;
    }
    public int getLongestLineLength() {
        //FIXME: Return the LONGEST line
        return customersInLine.size();
    }
        //FIXME: Ask
    public int getAverageWaitTime() {
        int avgWaitTime;
        avgWaitTime = (int) (avgCashierServTime * customersInLine.size());
        return avgWaitTime;
    }
    //SETTERS
    public void setParameters(int num, double s, double a, boolean ck) {
        numOfCashiers = num;
        avgCashierServTime = s;
        avgTimeBtwnCustomers = a;
        displayCheckout = ck;
    }
    public void customerGetsInLine() {

    }
    public void customerPays(int num) {

    }
}
