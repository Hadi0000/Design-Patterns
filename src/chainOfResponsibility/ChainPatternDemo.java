package chainOfResponsibility;

public class ChainPatternDemo {
	
	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setLogger(fileLogger);
		fileLogger.setLogger(consoleLogger);
		return errorLogger;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractLogger loggerChain = getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error");
	}

}
