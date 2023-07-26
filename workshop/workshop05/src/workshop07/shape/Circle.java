package workshop07.shape;

public class Circle extends Shape implements Movable {

	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(int radius, int x, int y) {
		super(new Point(x,y));
		this.radius = radius;
	}

	@Override
	public void move(int x, int y) {
		super.setPoint(new Point(getPoint().getX()+(x+1),getPoint().getY()+(y+1)));
	}

	@Override
	public double getArea() { // 넓이
		return radius*radius*3.14;
	}

	@Override
	public double getCircumference() { // 둘레
		
		return 2*3.14*radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	

}
