
public class Shape<T> {

	private double area;
	private double perimeter;
	private T shape;

	public Shape(T theShape) {
		shape=theShape;
	}
	public double getArea(){
		if(shape instanceof MyRectangle){
			area = ((MyRectangle) shape).getLength()*((MyRectangle) shape).getWidth();
		}

		else if(shape instanceof MyTriangle) {
			double p = (((MyTriangle) shape).getSideA() + ((MyTriangle) shape).getSideB() 
					+ ((MyTriangle) shape).getSideC())/2.0;
			
			area = Math.sqrt(p
					*(p-((MyTriangle) shape).getSideA())
					*(p-((MyTriangle) shape).getSideB())
					*(p-((MyTriangle) shape).getSideC()));
		}

		else if(shape instanceof MyCircle){
			area = Math.PI*Math.pow(((MyCircle) shape).getRadious(), 2);
		}
		
		return area;
	}
	public double getPerimeter() {
		if(shape instanceof MyRectangle) {
			perimeter= ((MyRectangle) shape).getLength()*2+ ((MyRectangle) shape).getWidth()*2; 
		}
		else if(shape instanceof MyTriangle) {
			perimeter = ((MyTriangle) shape).getSideA()+ ((MyTriangle)shape).getSideB()+ ((MyTriangle)shape).getSideC();
			}
		else {perimeter = Math.pow(((MyCircle)shape).getRadious(),2)*Math.PI;}
		return perimeter;
	
	}
}
