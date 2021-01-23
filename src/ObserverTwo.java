import java.util.Observable;


public class ObserverTwo implements Observer {
    private Flight _flight;

    private void setFlight(Flight flight) {
        this._flight = flight;
    }

    @Override
    public void update(Object f) {

        if (f == null) {
            System.out.println("Because the flight was lost, we cannot compute the changes in longitude, latitude, velocity, and altitude undergone in the last 60 seconds.");
            return;
        }

        Flight flight = (Flight) f;

        if (_flight != null) {
            System.out.println("Flight " + calcDelta(flight));
        } else {
            System.out.println(String.format("Wait at least 60 seconds for flight %s's longitude, latitude, velocity, and altitude values to change", flight.icao24));
        }

        this.setFlight((Flight) f);

    }

    private String calcDelta(Flight newInfo) {

        return String.format("Deltas -->  longitudinal delta: %f, latitudinal delta: %f, velocity delta: %f, altitude delta: %f",
                newInfo.longitude - _flight.longitude, newInfo.latitude - _flight.latitude, newInfo.velocity - _flight.velocity, newInfo.geo_altitude - _flight.geo_altitude);
    }
}
