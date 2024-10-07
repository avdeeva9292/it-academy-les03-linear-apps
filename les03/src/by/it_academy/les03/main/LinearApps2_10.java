package by.it_academy.les03.main;

public class LinearApps2_10 {

	public static void main(String[] args) {
		double a = 16;
		double s, h, r, R;
		s = Math.sqrt(3) * Math.pow(a, 2) / 4;
		h = 2 * s / a;
		r = 2 * s / (3 * a);
		R = Math.pow(a, 3) / (4 * s);
		System.out.println("s = " + s + " h = " + h + " r = " + r + " R = " + R);
	}

}
