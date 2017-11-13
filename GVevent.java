public abstract class GVevent implements Comparable{
    /** time the event is to occur */
    private double myTime;

    protected MarketPlace store;


    /** which cashier number is represented? */
    private int cashier;

    /****************************************************
     Constructor instantiates and event including the
     optional cashier number.
     @param type which type?
     @param t time of the event
     @param id cashier number
     ****************************************************/
    public GVevent(MarketPlace s, double t, int id){
        myTime = t;
        store = s;
        cashier = id;
    }

    /****************************************************
     Constructor instantiates and event.
     @param type which type?
     @param t time of the event
     ****************************************************/
    public GVevent(MarketPlace s, double t){
        myTime = t;
        store = s;
        cashier = -1;
    }

    public abstract void process();


    /****************************************************
     At what time?
     @returns the event time
     ****************************************************/
    public double getTime(){
        return myTime;
    }

    public int getCashier(){
        return cashier;
    }

    /******************************************************
     * This method is required for the Comparable interface
     * It returns a negative number if the first event is
     * scheduled to occur before the second event.  It is
     * not explicitely invoked within a program but instead
     * used when a comparison is necessary.
     * @param e is expected to be another GVevent
     *****************************************************/
    public int compareTo(Object e){

        // cast to a GVevent
        GVevent otherEvent = (GVevent) e;

        // assume the events are equal until proven otherwise
        int result = 0;
        if (myTime > otherEvent.getTime()){
            result = 1;
        }else if (myTime < otherEvent.getTime()){
            result = -1;
        }
        return result;
    }

}
