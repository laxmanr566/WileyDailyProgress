
public class Circle {
double radius;
double area;
	Circle(double radius){
		this.radius=radius;
	}
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
}
