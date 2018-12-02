package bridgePattern;

public class Circle extends Shape{
	private int radius, x, y;
	public Circle(DrawAPI drawapi, int x, int y, int radius) {
		super(drawapi);
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawapi.drawCircle(radius, x, y);
	}

}
