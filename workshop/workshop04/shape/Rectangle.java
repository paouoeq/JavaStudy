package shape;

public class Rectangle extends Shape implements Resize {
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public double getArea() { // 도형의 넓이 리턴
		return getWidth()*getHeight();
	}

	@Override
	public void setResize(int size) { // 도형의 사이즈 변경
		setWidth(getWidth()+size);

	}
	
	
	@Override
	public String toString() {
		return getArea() +"\t"+ super.toString();
	}


}
