package proxyPattern;

public class RealImage implements Image{
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadImage(fileName);
	}
	private void loadImage(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Loading image file: "+ fileName);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying image file: "+fileName);
	}
	
}
