package templateMethod;

public class Cricket extends Game{

	@Override
	void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Cricket Game is initialized");
	}

	@Override
	void startPlay() {
		// TODO Auto-generated method stub
		System.out.println("Cricket game is started");
	}

	@Override
	void endPlay() {
		// TODO Auto-generated method stub
		System.out.println("Cricket game is ended");
	}

}
