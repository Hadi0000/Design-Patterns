package bridgePattern;

public class RedCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Drawing a red circle which has a radius: "  + radius + " x: " + x + " y: "+ y);
	}

}
