public class TimeCalc {
    public static void main(String[] args) {
       int hours = Integer.parseInt(args[0].substring(0, 2)); 
	    int minutes = Integer.parseInt(args[0].substring(3, 5)); 
		int minutesToAdd = Integer.parseInt(args[1]);
        System.out.print("houres= " + hours + " minutes= " + minutes + " to add= " + minutesToAdd);
        int totalMinutes= ((hours*60) + minutes + minutesToAdd);
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = (totalMinutes - (totalHours*60));
        System.out.print(" new houres= " + newHours + " new minutes= " + newMinutes);
        if (newHours<10 && newMinutes<10){
            System.out.print("   0" + newHours + ":0" + newMinutes);
        } 
        else{
            if (newHours<10){
            System.out.print("   0" + newHours + ":" + newMinutes);
             }
        }
        if (newMinutes<10){
            System.out.print("   " + newHours + ":0" + newMinutes);
        }
        else{
           System.out.print("   " + newHours + ":" + newMinutes); 
        }
    }
}
