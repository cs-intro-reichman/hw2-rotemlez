// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	   int seedN = Integer.parseInt(args[0]);
	   String mode = args[1];
	   int seed = 4;
	   int steps = 1;
	   int seq=1;
	 while (seedN!=seq && mode=="v"){
		System.out.print(seq + " ");
			while (seed!=1 ){
				System.out.print(seed + " ");
					if (seed%2==0){
						seed = seed/2;
					}
						else{
							seed = (seed*3)+1;
						}
						steps++;
							}
					System.out.print(seed + " ");	
					System.out.println(" (" + steps + ") ");
					seedN--;
					seq++;
						 } 
				if (args[1]=="c"){
					System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
				}
				 System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
					}
			
	
}
