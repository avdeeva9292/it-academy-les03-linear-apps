package by.it_academy.les03.main;

public class LinearApps2_3 {

	public static void main(String[] args) {
		double x1, y1, x2, y2, AB;
		x1 = 6;
		y1 = 12;
		x2 = 9;
		y2 = 7;
		AB = Math.pow(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2), 0.5);
		System.out.print("AB = " + AB);
	}

}
