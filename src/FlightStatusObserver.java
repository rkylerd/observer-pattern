public class FlightStatusObserver implements IObserver {

    private Flight _flight;

    private void setFlight(Flight flight) {
        this._flight = flight;
    }

    @Override
    public void update(Object o) {

        if (o == null) {
            System.out.println("Flight over.");
            return;
        }

        this.setFlight( (Flight)o );

        if (_flight != null) {
            System.out.println( String.format( "Flight status --> %s", _flight.toString() ) );
        }

    }
}
