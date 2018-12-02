package observerPattern;

public class OctalObserver extends Observer{

	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attch(this);
	}
	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("Octal string"+ Integer.toOctalString(subject.getState()));
	}

}
