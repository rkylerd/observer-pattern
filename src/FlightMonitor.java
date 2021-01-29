
public class FlightMonitor {
	
	public static void main(String[] args) {
	
		FlightFeed feed = new FlightFeed();

		IObserver flightStatusObserver = new FlightStatusObserver();
		IObserver flightSafetyObserver = new FlightSafetyObserver();

		feed.attachObserver(flightStatusObserver);
		feed.attachObserver(flightSafetyObserver);

		feed.start();
	}
	
}