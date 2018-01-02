
public class Tester {

	public static void main(String[] args) {
		MyRectangle rectangle= new MyRectangle(4,4);
		Shape myObjectRectangle = new Shape(rectangle);
		
		MyTriangle triangle = new MyTriangle(1,2,3);
		Shape myObjectTriangle = new Shape(triangle);
		
		MyCircle circle = new MyCircle(2);
		Shape myObjectCircle = new Shape(circle);
		
		System.out.println("The perimeter of the rectabgle is: " + myObjectRectangle.getPerimeter());
		System.out.println("The perimeter of the triangle is: " + myObjectTriangle.getPerimeter());
		System.out.println("The perimeter of the circle is: " + myObjectCircle.getPerimeter());
		System.out.println("The area of the triangle is: " + myObjectTriangle.getArea());
		if(myObjectTriangle.getArea()==0) { 
			System.out.println("Impossibe triangle");
		}
		System.out.println("The area of the rectangle is: " + myObjectRectangle.getArea());
		System.out.println("The area of the circle is: " + myObjectCircle.getArea());
		

	}
	

}
