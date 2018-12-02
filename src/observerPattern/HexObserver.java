package observerPattern;

public class HexObserver extends Observer{

	public HexObserver(Subject subject) {
		this.subject = subject;
		this.subject.attch(this);
	}
	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("Hex string" + Integer.toHexString(subject.getState()).toUpperCase());
	}

}
