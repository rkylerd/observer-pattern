public class ObserverOne implements Observer {

    private Flight _flight;

    private void setFlight(Flight flight) {
        this._flight = flight;
    }

    @Override
    public void update(Object flight) {

        System.out.println("\n");

        if (flight == null) {
            System.out.println("Flight over.");
            return;
        }

        if (_flight != null) {
            System.out.print("New flight info --> ");
        }

        this.setFlight((Flight)flight);

        System.out.println(String.format("%s", _flight.toString()));
    }
}
