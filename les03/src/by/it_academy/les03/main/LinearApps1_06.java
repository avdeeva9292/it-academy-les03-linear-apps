package by.it_academy.les03.main;

public class LinearApps1_06 {

	public static void main(String[] args) {
		double a, b, c, d;
		a = 3.13;
		b = 8.16;
		c = 2.96;
		d = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))/ (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.print("d = " + d);

	}

}
