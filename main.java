import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
    double score = 0;
    int food = 10;
    int water = 10;
    
    //user chooses a dinosaur
    String dino = dinoPicker.dinoPicker();
    Player player = new Player( 10, 10, 60, 65, 0, 0, 0, "name" );
    if(dino == "Velociraptor"){
        player.setHealth(Velociraptor.getHealth());
        player.setSpeed(Velociraptor.getSpeed());
        player.setAttack(Velociraptor.getAttack());
        player.setMaxHealth(Velociraptor.getMaxHealth());
        player.setName(Velociraptor.getName());
    }
    else if(dino == "Carnotaurus"){
        player.setHealth(Carnotaurus.getHealth());
        player.setSpeed(Carnotaurus.getSpeed());
        player.setAttack(Carnotaurus.getAttack());
        player.setMaxHealth(Carnotaurus.getMaxHealth());
        player.setName(Carnotaurus.getName());
    }
    
    while(dino == "1"){
        dino = dinoPicker.dinoPicker();    
    }
    Scanner sc = new Scanner(System.in);
    System.out.println("\n-----Press enter to continue-----");
    String next = sc.nextLine();
    
    clearConsole();
    printUI(player.getHealth(), player.getMaxHealth(), player.getScore(), player.getFood(), player.getWater());
    
    //start game loop
    while((player.getWater() != 0) && (player.getFood() != 0) && (player.getHealth() > 1)){ 
        String location = locationPicker.locationPicker();
        String item = locationOptions.locationOptions(location);
        
        boolean chaseOutcome;
        switch(item){
            case "Puddle":  
                            System.out.println("You drank from the puddle");
                            int puddleAmount = (int)(Math.random()*(2)+1);
                            System.out.println("+" + puddleAmount + " water.");
                            player.setWater((player.getWater()+puddleAmount)); 
                            break;
            case "Carcass": 
                            System.out.println("You ate from the fresh carcass");
                            int carcassAmount = (int)(Math.random()*(2)+1);
                            System.out.println("+" + carcassAmount + " food.");
                            player.setFood((player.getFood()+carcassAmount));
                            break;
            case "Chicken":
                            System.out.println("You charge towards the chicken!");
                            chaseOutcome = chase(player.getSpeed(), Chicken.getSpeed());
                            if(chaseOutcome == true){
                                System.out.println("You caught the chicken!");
                                System.out.println("+" + Chicken.getFood() + " food");
                                player.setFood((player.getFood() + Chicken.getFood()));
                            }
                            else{
                                System.out.println("The chicken escapes!");
                            }
                            break;
            case "Goat":
                            System.out.println("You charge towards the goat!");
                            chaseOutcome = chase(player.getSpeed(), Goat.getSpeed());
                            if(chaseOutcome == true){
                                System.out.println("You caught the goat!");
                                System.out.println("+" + Goat.getFood() + " food");
                                player.setFood((player.getFood()+ Goat.getFood()));
                            }
                            else{
                                System.out.println("The goat escapes!");
                            }
                            break;
            case "River Water":
                            System.out.println("You head towards the river water.");
                            int num1 = (int)(Math.random()*(100)+1);
                            if (num1 > 4){
                                System.out.println("The water is clean! You drink up.");
                                System.out.println("+3 water");
                                player.setWater((player.getWater()+3));
                            }
                            else if(num1 < 4){
                                System.out.println("A deinosuchus attacks when you approach the water!");
                                chaseOutcome = chase(player.getSpeed(), Deinosuchus.getSpeed());
                                if(chaseOutcome == false){
                                    System.out.println("You attempt to flee... but it failed!");
                                    
                                    player.setHealth(combat(player.getHealth(), player.getMaxHealth(), player.getAttack(), player.getSpeed(), Deinosuchus.getHealth(), Deinosuchus.getMaxHealth(), Deinosuchus.getAttack(), Deinosuchus.getSpeed() ));
                                    if(player.getHealth() > 1){
                                    System.out.println("+" + Deinosuchus.getFood() + " food");
                                    player.setFood((player.getFood()+ Deinosuchus.getFood()));
                                    System.out.println("+5 points!");
                                    player.setScore(player.getScore() + 5);
                                    }
                                }
                                else{
                                    System.out.println("You attempt to flee... it was successful!");
                                }
                            }
                            break;
            case "Lake Water":
                            System.out.println("You head towards the lake water.");
                            num1 = (int)(Math.random()*(100)+1);
                            if (num1 > 30){
                                System.out.println("The water is clean! You drink up.");
                                System.out.println("+2 water");
                                player.setWater((player.getWater()+2));
                            }
                            else if(num1 < 30 && num1 > 8){
                                System.out.println("The water is too filthy to drink.");
                            }
                            else if(num1 < 8){
                                System.out.println("A deinosuchus attacks when you approach the water!");
                                chaseOutcome = chase(player.getSpeed(), Deinosuchus.getSpeed());
                                if(chaseOutcome == false){
                                    System.out.println("You attempt to flee... but it failed!");
                                    
                                    player.setHealth(combat(player.getHealth(), player.getMaxHealth(), player.getAttack(), player.getSpeed(), Deinosuchus.getHealth(), Deinosuchus.getMaxHealth(), Deinosuchus.getAttack(), Deinosuchus.getSpeed() ));
                                    if(player.getHealth() > 1){
                                    System.out.println("+" + Deinosuchus.getFood() + " food");
                                    player.setFood((player.getFood()+ Deinosuchus.getFood()));
                                    System.out.println("+5 points!");
                                    player.setScore(player.getScore() + 5);
                                    }
                                }
                                else{
                                    System.out.println("You attempt to flee... it was successful!");
                                }
                            }
                            break;
            case "Swamp Water":
                            System.out.println("You head towards the swamp water.");
                            num1 = (int)(Math.random()*(100)+1);
                            if (num1 > 50){
                                System.out.println("The water is clean! You drink up.");
                                System.out.println("+2 water");
                                player.setWater((player.getWater()+2));
                            }
                            else if(num1 < 50 && num1 > 20){
                                System.out.println("The water is too filthy to drink.");
                            }
                            else if(num1 < 20){
                                System.out.println("A deinosuchus attacks when you approach the water!");
                                chaseOutcome = chase(player.getSpeed(), Deinosuchus.getSpeed());
                                if(chaseOutcome == false){
                                    System.out.println("You attempt to flee... but it failed!");
                                    
                                    player.setHealth(combat(player.getHealth(), player.getMaxHealth(), player.getAttack(), player.getSpeed(), Deinosuchus.getHealth(), Deinosuchus.getMaxHealth(), Deinosuchus.getAttack(), Deinosuchus.getSpeed() ));
                                    if(player.getHealth() > 1){
                                    System.out.println("+" + Deinosuchus.getFood() + " food");
                                    player.setFood((player.getFood()+ Deinosuchus.getFood()));
                                    System.out.println("+5 points!");
                                    player.setScore(player.getScore() + 5);
                                    }
                                }
                                else{
                                    System.out.println("You attempt to flee... it was successful!");
                                }
                            }
                            break;
            case "Boar":
                            System.out.println("You charge towards the boar!");
                            chaseOutcome = chase(player.getSpeed(), Boar.getSpeed());
                            if(chaseOutcome == true){
                                System.out.println("You caught the boar!");
                                
                                player.setHealth(combat(player.getHealth(), player.getMaxHealth(), player.getAttack(), player.getSpeed(), Boar.getHealth(), Boar.getMaxHealth(), Boar.getAttack(), Boar.getSpeed() ));
                                if(player.getHealth() > 1){
                                    System.out.println("+" + Boar.getFood() + " food");
                                    player.setFood((player.getFood()+ Boar.getFood()));
                                    System.out.println("+2 points!");
                                    player.setScore(player.getScore() + 2);
                                }
                            }
                            else{
                                System.out.println("The boar escapes!");
                            }
                            break; 
            case "Tenontosaurus":
                            System.out.println("You charge towards the Tenontosaurus!");
                            chaseOutcome = chase(player.getSpeed(), Tenontosaurus.getSpeed());
                            if(chaseOutcome == true){
                                System.out.println("You caught the Tenontosaurus!");
                                
                                player.setHealth(combat(player.getHealth(), player.getMaxHealth(), player.getAttack(), player.getSpeed(), Tenontosaurus.getHealth(), Tenontosaurus.getMaxHealth(), Tenontosaurus.getAttack(), Tenontosaurus.getSpeed() ));
                                if(player.getHealth() > 1){
                                    System.out.println("+" + Tenontosaurus.getFood() + " food");
                                    player.setFood((player.getFood()+ Tenontosaurus.getFood()));
                                    System.out.println("+4 points!");
                                    player.setScore(player.getScore() + 4);
                                }
                            }
                            else{
                                System.out.println("The Tenontosaurus escapes!");
                            } 
                            break; 
                            
            }
        
        
        
        
        
        if(player.getWater() > 10){
            player.setWater(11);   
        }
        if(player.getFood() > 10){
            player.setFood(11);
        }
        if(player.getHealth() < player.getMaxHealth() && player.getHealth() > 0){
            player.setHealth(player.getHealth()+10);
        }
        if(player.getHealth() > player.getMaxHealth()){
            player.setHealth(player.getMaxHealth());
        }
        player.setWater((player.getWater() - 1));
        player.setFood((player.getFood() - 1));
        player.setScore(player.getScore() + 1);
        
        System.out.println("\n-----Press enter to continue-----");
        next = sc.nextLine();
        clearConsole();
        printUI(player.getHealth(), player.getMaxHealth(), player.getScore(), player.getFood(), player.getWater());
    }
    System.out.println("\n--------------------Game over!--------------------");
    if(player.getHealth() < 1){
        System.out.println("Pro tip: Keep health above '0' to stay alive!\n");
    }
    else if(player.getWater() == 0){
        System.out.println("Don't forget to stay hydrated!\n");
    }
    else if(player.getFood() == 0){
        System.out.println("Food is required in order to live!\n");
    }
    System.out.println("You scored " + player.getScore() + " point(s) as a " + dino + "\n");
    saveScore(dino, player.getScore());
    
    
    List<Score> scr = getScores();
    System.out.println( "Top 10 Scores:");
        scr.stream().sorted( (a,b) -> Integer.compare( b.getScore(), a.getScore() ))
            .limit(10)
            .forEach( System.out::println );
    }
    
    
    
    
    public static boolean chase(int speed1, int speed2){
        int num1 = (int)(Math.random()*(20)+1);//1-20
        int num2 = (int)(Math.random()*(20)+1);
        
        int creatureSpeed1 = num1 + speed1;
        int creatureSpeed2 = num2 + speed2;
        if(creatureSpeed1 > creatureSpeed2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void clearConsole() {
        System.out.print('\u000C');   
    }
    
    public static void printUI(int health, int maxHealth, int score, int food, int water) {
        System.out.println("Health = " + health + "/" + maxHealth + "\nScore = " + score + "\nFood = " + food + "/10" + "\nWater = " + water + "/10");  
    }
    
    public static int combat(int dino1Health, int dino1MaxHealth, int dino1Attack, int dino1Speed, int dino2Health, int dino2MaxHealth, int dino2Attack, int dino2Speed) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-----Press enter to engage in combat-----");
        String next = sc.nextLine();
        
        int health = 0;
        while(dino1Health > 0 && dino2Health > 0){
            clearConsole();
            printCombatUI(dino1Health, dino1MaxHealth, dino1Attack, dino1Speed, dino2Health, dino2MaxHealth, dino2Attack, dino2Speed);
            int speed1 = dino1Speed;
            
            
            int x = 0;
            Scanner s = new Scanner(System.in);
            System.out.println("\n1) Quick attack: Bite\n2) Strong attack: Claw");
            int attack = s.nextInt();
            int attack1 = 0;
            while( x == 0){
                if(attack == 1){
                    System.out.println("You used bite!");
                    attack1 = (int)(Math.random()*(dino1Attack)+1);
                    x++;
                }
                else if(attack == 2){
                    System.out.println("You used claw!");
                    attack1 = (int)(Math.random()*(dino1Attack)+8);
                    dino1Speed = dino1Speed - 30;
                    x++;
                }
                else{
                    System.out.println("Invalid input, please enter '1' or '2'");
                    attack = s.nextInt();
                    continue;
                }
            }
            
            //int attack1 = (int)(Math.random()*(dino1Attack)+1);//1-20
            int attack2 = (int)(Math.random()*(dino2Attack)+1);
            
            int dodge1 = (int)(Math.random()*(dino1Speed-dino2Speed)+1);
            int dodge2 = (int)(Math.random()*(dino2Speed-dino1Speed)+1);
            
            if(dodge1 < 15){
                dino1Health = dino1Health - attack2;
                System.out.println("\nYou took " + attack2 + " damage!");
            }
            else{
                System.out.println("\nYou dodged the attack!");
            }
            if(dodge2 < 15){
                dino2Health = dino2Health - attack1;
                System.out.println("They took " + attack1 + " damage!");
            }
            else{
                System.out.println("They dodged the attack!");
            }
        
            dino1Speed = speed1;
            
            System.out.println("\n-----Press enter to continue-----");
            String next1 = sc.nextLine();
        }
        if(dino1Health > 0){
            System.out.println("You won the fight!");
            health = dino1Health;
        }
        if(dino2Health > 0){
            System.out.println("You lost the fight!");
            health = 0;
        }
        
        return health;
    }
    
    public static void printCombatUI(int dino1Health, int dino1MaxHealth, int dino1Attack, int dino1Speed, int dino2Health, int dino2MaxHealth, int dino2Attack, int dino2Speed) {
        System.out.println("Your health = " + dino1Health + "/" + dino1MaxHealth + "\t\t\tEnemy health = " + dino2Health + "/" + dino2MaxHealth);
        System.out.println("Your attack = " + dino1Attack + "\t\t\tEnemy attack = " + dino2Attack);
        System.out.println("Your speed = " + dino1Speed + "\t\t\t\tEnemy speed = " + dino2Speed);
    }
    
    private static void saveScore(String dino, int score){
        File file = new File("Data/scores.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.append(dino + ", " + score);
            writer.newLine();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static List<Score> getScores(){
        List<Score> scr = new ArrayList<>(); 
        
        try{
        BufferedReader reader = new BufferedReader(new FileReader("Data/scores.txt"));
        
        String currentLine = reader.readLine();
        while (currentLine != null){
            String[] allScores = currentLine.split(", ");
            String name = allScores[0];
            int score = Integer.valueOf(allScores[1]);
            scr.add(new Score(name, score));
            currentLine = reader.readLine();
        }
    
        }
        catch( FileNotFoundException e ){
            System.out.println( "File could not be found" );
        }
        catch( IOException e ){
            System.out.println( "Error while reading from file" );
        }
        catch( NumberFormatException e ){
            System.out.print( "File was not formated correctly" );
        }
        return scr;
    }

    
}