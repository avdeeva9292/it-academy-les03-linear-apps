package by.it_academy.les03.main;

public class LinearApps2_2 {

	public static void main(String[] args) {
		double a, b, c, P, S;
		a = 5;
		b = 7;
		c = Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 0.5);
		P = a + b + c;
		S = a * b / 2;
		System.out.println("P = " + P + " S = " + S);
	}

}
