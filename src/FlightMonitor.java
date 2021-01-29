
public class FlightMonitor {
	
	public static void main(String[] args) {
	
		FlightFeed feed = new FlightFeed();

		IObserver flightSafetyObserver = new FlightSafetyObserver();
		IObserver flightStatusObserver = new FlightStatusObserver();

		feed.attachObserver(flightSafetyObserver);
		feed.attachObserver(flightStatusObserver);

		feed.start();
	}
	
}