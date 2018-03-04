
public class Calculations {

	public static void main(String[] args) {
		double a = 1;
		double b = -2;
		double c = -3;
		double x1, x2;
		
		x1 = ((-b + Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a));
		x2 = ((-b - Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a));
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);

	}

}
