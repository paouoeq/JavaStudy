package shape;

public class Triangle extends Shape implements Resize {

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public double getArea() { // 도형의 넓이 리턴
		return getWidth()*getHeight()*0.5;
	}

	@Override
	public void setResize(int size) { // 도형의 사이즈 변경
		setHeight(getHeight()+size);
		
	}

	@Override
	public String toString() {
		return getArea() +"\t"+ super.toString();
	}
	
	
}
