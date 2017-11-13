public class GVdeparture extends GVevent{
    public GVdeparture(MarketPlace store, double time, int id) {
        super(store, time, id);
    }

    @Override
    public void process() {
        //FIXME
        MarketPlace.customerPays();
    }

}
