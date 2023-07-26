package workshop07.shape;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		
		ArrayList<Shape> list = new ArrayList<>();
		
		list.add(new Rectangle(4,7,5));
		list.add(new Rectangle(5,4,6));
		list.add(new Circle(6,6,7));
		list.add(new Circle(7,8,3));
		
		System.out.println("구분\t\t길이\tX좌표\tY좌표\tArea\tCircumference");
		
		for(Shape s : list) {
			if(s instanceof Rectangle) {
				Rectangle r = (Rectangle)s;
				System.out.println("Rectangle\t" + r.getWidth() +"\t"+ s.getPoint().getX() +"\t"+ s.getPoint().getY() +"\t"+ Math.round(s.getArea()) +"\t"+ Math.round(s.getCircumference()));
			}else {
				Circle r = (Circle)s;
				System.out.println("Circle\t\t" + r.getRadius() +"\t"+ s.getPoint().getX() +"\t"+ s.getPoint().getY() +"\t"+ Math.round(s.getArea()) +"\t"+ Math.round(s.getCircumference()));				
			}
		}
		
		
		System.out.println("\n이동 후...");
		for(Shape s : list) {
			if(s instanceof Rectangle) {
				Rectangle r = (Rectangle)s;
				r.move(10, 10);
				System.out.println("Rectangle\t" + r.getWidth() +"\t"+ s.getPoint().getX() +"\t"+ s.getPoint().getY());
			}else {
				Circle r = (Circle)s;
				r.move(10, 10);
				System.out.println("Circle\t\t" + r.getRadius() +"\t"+ s.getPoint().getX() +"\t"+ s.getPoint().getY());				
				
			}
		}
	}

}
