package observerPattern;
import java.util.ArrayList;
import java.util.List;


public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObserver();
	}
	public void notifyAllObserver() {
		// TODO Auto-generated method stub
		for(Observer obs : observers ) {
			obs.change();
		}
	}
	public void attch(Observer o) {
		observers.add(o);
	}
	
}
