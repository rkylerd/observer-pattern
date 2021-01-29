public interface ISubject {
	public void notifyObservers(Flight f);

	public void attachObserver(IObserver o);
}
