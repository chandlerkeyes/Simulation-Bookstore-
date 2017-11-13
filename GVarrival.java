public class GVarrival extends GVevent {

    public GVarrival (MarketPlace store, double time) {
        super(store,time);
    }
    @Override
    public void process() {
        //FIXME
        MarketPlace.customerGetsInLine();
    }
}
