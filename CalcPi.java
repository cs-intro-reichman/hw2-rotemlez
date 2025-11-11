// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int terms = Integer.parseInt(args[0]);
		String Pi = String.valueOf(Math.PI);
		int ch = 1;
		while (terms!=1){
			ch++;
			terms = terms/10;
		}
		System.out.println("pi according to java: " + Math.PI);
		String newPi = Pi.substring(0, ch) + '0' + Pi.substring(ch+1);
		System.out.println("pi, approximated: " + newPi);

	}
}
