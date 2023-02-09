import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class locationOptions{
    public static String locationOptions(String a1){
        List<String> itemList = new ArrayList<>();
        
        switch(a1){
            case "Plains":  if( (roll(Plains.getChickenSpawnRate()) == true) ){
                                Boolean chicken = true;
                                itemList.add("Chicken");
                            }
                            if( (roll(Plains.getPuddleSpawnRate()) == true) ){
                                Boolean puddle = true;
                                itemList.add("Puddle");
                            }
                            if( (roll(Plains.getGoatSpawnRate()) == true) ){
                                Boolean goat = true;
                                itemList.add("Goat");
                            }
                            if( (roll(Plains.getGoreSpawnRate()) == true) ){
                                Boolean gore = true;
                                itemList.add("Carcass");
                            }
                            if( (roll(Plains.getBoarSpawnRate()) == true) ){
                                Boolean boar = true;
                                itemList.add("Boar");
                            }
                            if( (roll(Plains.getTenontosaurusSpawnRate()) == true) ){
                                Boolean boar = true;
                                itemList.add("Tenontosaurus");
                            }
                            break;
            case "Swamp":
                            if( (roll(Swamp.getChickenSpawnRate()) == true) ){
                                Boolean chicken = true;
                                itemList.add("Chicken");
                            }
                            if( (roll(Swamp.getPuddleSpawnRate()) == true) ){
                                Boolean puddle = true;
                                itemList.add("Puddle");
                            }
                            if( (roll(Swamp.getGoatSpawnRate()) == true) ){
                                Boolean goat = true;
                                itemList.add("Goat");
                            }
                            if( (roll(Swamp.getGoreSpawnRate()) == true) ){
                                Boolean gore = true;
                                itemList.add("Carcass");
                            }
                            if( (roll(Swamp.getSwampWaterSpawnRate()) == true) ){
                                Boolean gore = true;
                                itemList.add("Swamp Water");
                            }
                            if( (roll(Plains.getBoarSpawnRate()) == true) ){
                                Boolean boar = true;
                                itemList.add("Boar");
                            }
                            if( (roll(Plains.getTenontosaurusSpawnRate()) == true) ){
                                Boolean boar = true;
                                itemList.add("Tenontosaurus");
                            }
                            break;  
            case "River":
                            if( (roll(River.getChickenSpawnRate()) == true) ){
                                Boolean chicken = true;
                                itemList.add("Chicken");
                            }
                            if( (roll(River.getPuddleSpawnRate()) == true) ){
                                Boolean puddle = true;
                                itemList.add("Puddle");
                            }
                            if( (roll(River.getGoatSpawnRate()) == true) ){
                                Boolean goat = true;
                                itemList.add("Goat");
                            }
                            if( (roll(River.getGoreSpawnRate()) == true) ){
                                Boolean gore = true;
                                itemList.add("Carcass");
                            }
                            if( (roll(River.getRiverWaterSpawnRate()) == true) ){
                                Boolean gore = true;
                                itemList.add("River Water");
                            }
                            if( (roll(Plains.getBoarSpawnRate()) == true) ){
                                Boolean boar = true;
                                itemList.add("Boar");
                            }
                            if( (roll(Plains.getTenontosaurusSpawnRate()) == true) ){
                                Boolean boar = true;
                                itemList.add("Tenontosaurus");
                            }
                            break;    
            case "Hills":
                            if( (roll(Hills.getChickenSpawnRate()) == true) ){
                                Boolean chicken = true;
                                itemList.add("Chicken");
                            }
                            if( (roll(Hills.getPuddleSpawnRate()) == true) ){
                                Boolean puddle = true;
                                itemList.add("Puddle");
                            }
                            if( (roll(Hills.getGoatSpawnRate()) == true) ){
                                Boolean goat = true;
                                itemList.add("Goat");
                            }
                            if( (roll(Hills.getGoreSpawnRate()) == true) ){
                                Boolean gore = true;
                                itemList.add("Carcass");
                            }
                            if( (roll(Plains.getBoarSpawnRate()) == true) ){
                                Boolean boar = true;
                                itemList.add("Boar");
                            }
                            if( (roll(Plains.getTenontosaurusSpawnRate()) == true) ){
                                Boolean boar = true;
                                itemList.add("Tenontosaurus");
                            }
                            break;    
            case "Forest":
                            if( (roll(Forest.getChickenSpawnRate()) == true) ){
                                Boolean chicken = true;
                                itemList.add("Chicken");
                            }
                            if( (roll(Forest.getPuddleSpawnRate()) == true) ){
                                Boolean puddle = true;
                                itemList.add("Puddle");
                            }
                            if( (roll(Forest.getGoatSpawnRate()) == true) ){
                                Boolean goat = true;
                                itemList.add("Goat");
                            }
                            if( (roll(Forest.getGoreSpawnRate()) == true) ){
                                Boolean gore = true;
                                itemList.add("Carcass");
                            }
                            if( (roll(Plains.getBoarSpawnRate()) == true) ){
                                Boolean boar = true;
                                itemList.add("Boar");
                            }
                            if( (roll(Plains.getTenontosaurusSpawnRate()) == true) ){
                                Boolean boar = true;
                                itemList.add("Tenontosaurus");
                            }
                            break;    
            case "Lake":
                            if( (roll(Lake.getChickenSpawnRate()) == true) ){

                                Boolean chicken = true;
                                itemList.add("Chicken");
                            }
                            if( (roll(Lake.getPuddleSpawnRate()) == true) ){
                                Boolean puddle = true;
                                itemList.add("Puddle");
                            }
                            if( (roll(Lake.getGoatSpawnRate()) == true) ){
                                Boolean goat = true;
                                itemList.add("Goat");
                            }
                            if( (roll(Lake.getGoreSpawnRate()) == true) ){
                                Boolean gore = true;
                                itemList.add("Carcass");
                            }
                            if( (roll(Lake.getLakeWaterSpawnRate()) == true) ){
                                Boolean gore = true;
                                itemList.add("Lake Water");
                            }
                            if( (roll(Plains.getBoarSpawnRate()) == true) ){
                                Boolean boar = true;
                                itemList.add("Boar");
                            }
                            if( (roll(Plains.getTenontosaurusSpawnRate()) == true) ){
                                Boolean boar = true;
                                itemList.add("Tenontosaurus");
                            }
                            break;
        }
        
        
        if(itemList.isEmpty()){
            System.out.println("As you approach the " + a1 + " you see nothing of interest.");
        }
        else if(itemList.size() > 1){
            System.out.println("As you approach the " + a1 + " you see several things:");
        }
        else{
            System.out.println("As you approach the " + a1 + " you see:");
        } 
        itemList.forEach(System.out::println);
        Scanner sc = new Scanner(System.in);
        String approachItem = "";
        if(!itemList.isEmpty()){
            System.out.println("\nChoose a number 1-"+ itemList.size() + " to approach something. Type '0' to pass.");
            String approachChoiceStr = sc.nextLine();
            //approachChoice = Integer.parseInt(approachChoice);
            try{
            int approachChoice = Integer.parseInt(approachChoiceStr);
            while( approachChoice < 0 || approachChoice > itemList.size()) {
                System.out.println("Invalid input, try again");
                approachChoiceStr = sc.nextLine();
                approachChoice = Integer.parseInt(approachChoiceStr);
            }
            if(approachChoice == 0){
                return "";
            }
            
            
            approachItem = itemList.get(approachChoice-1);
            System.out.println(approachItem);
            return approachItem;
            }
            catch(ArrayIndexOutOfBoundsException exception) {
                System.out.println("Invalid input option. Continuing to next location. ");
            }
            catch(NumberFormatException e) {
                System.out.println("Invalid input option. Continuing to next location. ");
            }
        }
        return approachItem;
        
    }
    
    
    public static boolean roll(int a){
        int num1 = (int)(Math.random()*(100)+1);//1-100
        if(num1 < a){
            return true;
        }
        else{
            return false;
        }
    }
    
}
