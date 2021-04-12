//Circle class is now a "certified" shape

public class Circle implements Shape {

private double radius;
    
  
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double caclulateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2.0 * Math.PI * radius;
    }

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

    
    
}
