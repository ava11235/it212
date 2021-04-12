
public class ShapeTester {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(5.5);
		Triangle t1 = new Triangle(1,2,3);
		Circle c2 = new Circle(7.4);
		
		System.out.println(shapes(c1));
		System.out.println(shapes(t1));
		System.out.println(shapes(c2));	
	}

		public static String shapes(Shape s) {
		    return "Area : " + s.caclulateArea() + "\nPerimeter: " + s.calculatePerimeter();
		}

		

}
