
public class Collatz { 
    public static void main(String[] args) {
        
        int seedN = Integer.parseInt(args[0]);
        String mode = args[1]; 
        
		boolean firstSeq = false;
        
        for (int i = 1; i <= seedN; i++) { 
         	int seed = i; 
            int steps = 1; 
            
            // הדפסת האיבר הראשון
            if (mode.equals("v")) {
                System.out.print(seed);
            }
			if (seed==1 && !firstSeq)
			{
				seed = (3 * seed) + 1;
				firstSeq = true;
				System.out.print(" " + seed);
			}
            while (seed != 1) { 
                
                if (seed % 2 == 0) {
                    seed = seed / 2;
                } else {
                    seed = (3 * seed) + 1;
                }
                
                steps++;
                
                // הדפסת האיברים הנותרים
                if (mode.equals("v")) {
                    System.out.print(" " + seed); 
                }
            }
            
            // סיום הדפסת הסדרה (צעדים)
            if (mode.equals("v")) {
                System.out.println(" (" + steps + ")");
            }
        } // סוף הלולאה החיצונית
        
        // הדפסת שורת הסיכום (הייתה כפילות בקוד שלך)
        if (mode.equals("c") || mode.equals("v")) { 
            System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
            // בקוד המקורי הייתה שורה כפולה כאן: System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
        }
    }
}