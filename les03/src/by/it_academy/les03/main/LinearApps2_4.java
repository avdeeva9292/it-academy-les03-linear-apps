package by.it_academy.les03.main;

public class LinearApps2_4 {

	public static void main(String[] args) {
		double x1, x2, x3, y1, y2, y3, z1, z2, z3;
		double AB, BC, AC, P, S;
		x1 = 5;
		x2 = 8; 
		x3 = 12;
		
		y1 = 3;
		y2 = 7;
		y3 = 10;
		
		z1 = 2;
		z2 = 6;
		z3 = 16;
		
		AB = Math.pow(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2) + Math.pow((z1 - z2), 2), 0.5);
		BC = Math.pow(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2) + Math.pow((z2 - z3), 2), 0.5);
		AC = Math.pow(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2) + Math.pow((z3 - z1), 2), 0.5);
		
		P = AB + BC + AC;
		S = Math.pow(P/2 * (P/2 - AB) * (P/2 - BC) * (P/2 - AC), 0.5) ;
		System.out.print("P = " + P + " S = " + S);	
	}

}
