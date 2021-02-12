package DPobservator;

import java.util.ArrayList;
import java.util.List;

public class ObservableImp  implements observable{
	
	private int state = 10;
	private List<Observer> observers = new ArrayList<Observer>();
	

	@Override
	public void subscribe(Observer o) {
		
		this.observers.add(o);
		
	}

	@Override
	public void unsubscribe(Observer o) {
		
		this.observers.remove(o);
	
	}

	@Override
	public void notifyObservers() {
		
		for(Observer o:observers)
		{
			o.update(state);
		}
		
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyObservers();
	}
	
	
	

}
