package chainOfResponsibility;

public class ConsoleLogger extends AbstractLogger{
	
	public ConsoleLogger(int level) {
		this.level = level;
	}
	@Override
	void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("Standard console :: Logger:  "+message);
	}

}
