// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int terms = Integer.parseInt(args[0]);
		double sum = 0.0;
		double coef = 1.0;
		for (int i=0; i<terms; i++){
			double a = coef / (2*i + 1.0);
			sum += a;
			coef = -coef;
		}
		double newPi = 4*sum;
		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, approximated:     " + newPi);

	}
}
