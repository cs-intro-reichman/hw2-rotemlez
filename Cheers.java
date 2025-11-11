//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheers = args[0].toUpperCase();
            int times = Integer.parseInt(args[1]);
            int len = cheers.length();
            int ch = 0;
            while (len!=0){
                if (cheers.charAt(ch)== 'A'|| cheers.charAt(ch)== 'E' || cheers.charAt(ch)== 'F' ||cheers.charAt(ch)== 'H' || cheers.charAt(ch)== 'I' || cheers.charAt(ch)== 'L' || cheers.charAt(ch)== 'M' || cheers.charAt(ch)== 'N' || cheers.charAt(ch)== 'O' || cheers.charAt(ch)== 'R' ){
                        System.out.println("Give me an " + cheers.charAt(ch) + ": " + cheers.charAt(ch) + "!");
                }
                else{
                     System.out.println("Give me a  " + cheers.charAt(ch) + ": " + cheers.charAt(ch) + "!");   
                }
                ch++;
                len--;
            }
            System.out.println("What does the spell?");
            while (times>0){
                System.out.println(cheers + "!!!");
                times--;
            }
        }
}
