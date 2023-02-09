import java.util.Random;
import java.util.Scanner;

public class locationPicker{
    public static String locationPicker(){
        String[] locs = {"Plains", "Swamp", "River", "Plains", "Hills", "Forest", "Lake"};
        int randomNum1 = (int)(Math.random()*(locs.length));
        int randomNum2 = (int)(Math.random()*(locs.length));//+1
        while(randomNum2 == randomNum1){
            randomNum2 = (int)(Math.random()*(locs.length));
        }
                        
        System.out.println("\nYou see two destinations ahead, choose one:\n1.) " + locs[randomNum1] + "\n2.) " + locs[randomNum2]);
        //System.out.println("\nOr press 'enter' to continue traveling ");
        Scanner sc = new Scanner(System.in);
        int x = 0;
        String locationChoice = sc.nextLine().toLowerCase().trim();
        while(x == 0){
            //Scanner sc = new Scanner(System.in);
            //locationChoice = sc.nextLine().toLowerCase().trim();
            if((locationChoice.equals("1")) || (locationChoice.equals("2"))){
                locationChoice = locationChoice;
                x++;
            }
            else{
                System.out.println("Invalid input, please enter '1' or '2'");
                locationChoice = sc.nextLine().toLowerCase().trim();
            }
            //locationChoice = locationChoice.toLowerCase().trim(); 
        }
        //sc.close();
        if(locationChoice.equals("1") || locationChoice.equals(locs[randomNum1])){
            System.out.println("You journey towards the " + locs[randomNum1]);    
            locationChoice = locs[randomNum1];
        }
        else if(locationChoice.equals("2") || locationChoice.equals(locs[randomNum2])){
            System.out.println("You journey towards the " + locs[randomNum2]); 
            locationChoice = locs[randomNum2];
        }
        return locationChoice;
        
    }
}
