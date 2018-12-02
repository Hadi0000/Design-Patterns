package templateMethod;

public class TemplatePatternDemo {

	public static void main(String[] args) {
		Game cricket = new Cricket();
		//cricket.play();
		cricket.initialize();
		System.out.println();
		Game football = new Football();
		football.play();
	}
}
