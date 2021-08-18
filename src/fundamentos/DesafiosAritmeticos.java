package fundamentos;

public class DesafiosAritmeticos {
	public static void main(String[] args) {
		int a = 2;
		double c = Math.pow(a, 3);
		int b = (int) Math.pow(a, 3);
		System.out.println(c);
		System.out.println(b);
		
		double s1 = 3 + 2;
		double m1 = 6 * s1;
		double p1 = Math.pow(m1, 2);
		double d1 = p1 / (3 * 2);
		
		double sa2 = 1 - 5;
		double su2 = 2 - 7;
		double mu2 = sa2 * su2;
		double du2 = mu2 / 2;
		double pu2 = Math.pow(du2, 2);
		
		double sm3 = d1 - pu2;
		double pm3 = Math.pow(sm3, 3);
		
		double result = pm3 / Math.pow(10, 3);
		
		System.out.println(result);
		
	}
}
