package by.it_academy.les03.main;

public class LinearApps1_08 {

	public static void main(String[] args) {
		int n, x;
		double z;
		n = 4;
		x = 1;
		while (x <= n) {
			z = Math.pow(Math.PI, x);
			System.out.println("PI" + x + " = " + z);
			x = x + 1;
		}

	}

}
