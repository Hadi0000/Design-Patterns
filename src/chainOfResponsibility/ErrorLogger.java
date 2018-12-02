package chainOfResponsibility;

public class ErrorLogger extends AbstractLogger{
	
	public ErrorLogger(int level) {
		this.level = level;
	}
	@Override
	void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("Error console :: Logger:  "+message);
	}
	
}
