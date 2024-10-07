package by.it_academy.les03.main;

public class LinearApps1_09 {

	public static void main(String[] args) {
		int n = 1234;
		int n1, n2, n3, n4, comp;
		n1 = n % 10;
		n2 = n / 10;
		n2 = n2 % 10;
		n3 = n / 100;
		n3 = n3 % 10;
		n4 = n / 1000;
		n4 = n4 % 10;
		comp = n1 * n2 * n3 * n4;
		System.out.print("comp = " + comp);

	}

}
