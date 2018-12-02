package observerPattern;

public class BinaryObserver extends Observer{

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attch(this);
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("binary string" + Integer.toBinaryString(subject.getState()));
	}
	
}
