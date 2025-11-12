// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	   int seedN = Integer.parseInt(args[0]);
	   String mode = args[1];
	   int seed;
	   int steps = 0;
	   for (int i=1; i<=seedN; i++){
			seed = i;
			if(mode.equals("v")){
				System.out.print(seed);	
			}
			while (seed!=1 ){
				System.out.print(seed + " ");
					if (seed%2==0){
						seed = seed/2;
					}
						else{
							seed = (seed*3)+1;
						}
							}
				steps++;
				if (mode.equals("v")){
					System.out.print(" " + seed);
				}
	   }	
			
					if (mode.equals("v")){
					System.out.println(" (" + steps + ") ");
					}
				if (mode.equals("c")){
					System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
				}
				 System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
					}
			
	
}
