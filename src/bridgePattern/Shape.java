package bridgePattern;

public abstract class Shape {
	protected DrawAPI drawapi;
	
	public Shape(DrawAPI drawapi) {
		this.drawapi = drawapi;
	}
	public abstract void draw();
}
