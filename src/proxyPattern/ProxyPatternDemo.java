package proxyPattern;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image im = new ProxyImage("test_10mb.jpg");
		
		im.display();
		System.out.println("");
		
		im.display();
	}

}
