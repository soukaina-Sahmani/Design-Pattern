package DPobservator;

public interface observable {
	
	public void subscribe(Observer o); //addObserver
	public void unsubscribe(Observer o); // removeObserver
	public void notifyObservers();

}
