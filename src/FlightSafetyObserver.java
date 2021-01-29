import java.util.Observable;


public class FlightSafetyObserver implements IObserver {
    private Flight _flight;

    private void setFlight(Flight flight) {
        this._flight = flight;
    }

    @Override
    public void update(Object o) {
        if (o == null) {
            System.out.println("Because the flight was lost, we cannot compute the changes in longitude, latitude, velocity, and altitude undergone in the last 60 seconds.");
            return;
        }

        Flight f = (Flight)o;

        if (_flight != null) {
            System.out.println("\nFlight Safety info -->  " + calcDelta(f) );
        } else {
            System.out.println(String.format("\nWait at least 10 seconds for flight %s's longitude, latitude, velocity, and altitude values to change", f.icao24));
        }
        this.setFlight(f);
    }

    private String calcDelta(Flight f) {
        return String.format("longitudinal delta: %f, latitudinal delta: %f, velocity delta: %f, altitude delta: %f",
                f.longitude - _flight.longitude, f.latitude - _flight.latitude, f.velocity - _flight.velocity, f.geo_altitude - _flight.geo_altitude);
    }
}
