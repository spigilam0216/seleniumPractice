package javaPractice;

public class Rectangle {
	int length;
	int breadth;
	int area;
	
	Rectangle() {
		
	}
	
	Rectangle(int lng, int brdt) {
		length = lng;
		breadth = brdt;
		
	}
	
	Rectangle(int lng) {
		length = lng;
		breadth = lng;
		
	}
	
	public int area() {
		area = length * breadth;
		System.out.println("Area of the rectangle:" + area);
		return area;
	}

	public static void main(String[] args) {
		// create an object with default constructor
		Rectangle r1 = new Rectangle();
		r1.area();
		
		// create an object with with one argument to constructor
		Rectangle r2 = new Rectangle(10);
		r2.area();
		
		// create an object with two arguments constructor
		Rectangle r3 = new Rectangle(20, 7);
		r3.area();

	}

}
