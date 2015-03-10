package Quiz3;

public class Triangle extends GeometricObject {
	private static double side1, side2, side3;

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public Triangle () {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public Triangle (double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public static double getSide3() {
		return side3;
	}

	public static double getSide2() {
		return side2;
	}

	public static double getSide1() {
		return side1;
	}

	public double getArea() {
		double Area = (side1 * side2) / 2;
		return Area;
	}

	public double getPerimeter() {
		double Perimeter = side1 + side2 + side3;
		return Perimeter;
	}

	public String toString() {
		return ("This rectangle has 3 sides: " + String.valueOf(getSide1())
				+ ", " + String.valueOf(getSide2()) + ", and "
				+ String.valueOf(getSide3()) + ". It has an area of "
				+ String.valueOf(getArea()) + ", and a perimeter of "
				+ String.valueOf(getPerimeter()) + ".");
	}

	public static void main(String[] args) {
	}
}
