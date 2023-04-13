package problem1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] object = {new Rectangle("red",3,3),
						  new Rectangle("red",4,4),
						  new Circle("blue",4),
						  new Circle("blue",3),
						  new Square("white",2)};

		for(Shape s : object){
			System.out.println("Calculate Area of "+ s.getClass().getSimpleName()+" is :" + s.calculateArea() );
			System.out.println("Calculate Peri of "+ s.getClass().getSimpleName()+" is :" + s.calculatePerimeter());
		}
	}
}
