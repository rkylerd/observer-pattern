
public class FlightMonitor {
	
	public static void main(String[] args) {
	
		FlightFeed feed = new FlightFeed();

		ObserverOne observer1 = new ObserverOne();
		ObserverTwo observer2 = new ObserverTwo();

		feed.attachObserver(observer1);
		feed.attachObserver(observer2);

		feed.start();
	}
	
}