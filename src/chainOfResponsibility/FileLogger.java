package chainOfResponsibility;

public class FileLogger extends AbstractLogger{
	
	public FileLogger(int level) {
		this.level = level;
	}
	@Override
	void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("File::Logger:  "+message);
	}

}
