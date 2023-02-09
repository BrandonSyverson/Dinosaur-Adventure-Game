import java.util.Scanner;

public class dinoPicker{
    public static String dinoPicker(){
        String dinoChoice = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to play as a carnivore or herbivore? ");
        String dietChoice = sc.nextLine();
        sc.close();
        dietChoice = dietChoice.toLowerCase().trim();
        if(dietChoice.equals("carnivore") || dietChoice.equals("carni")){
            int x = 0;
            while(x == 0){
                Scanner sc2 = new Scanner(System.in);
                System.out.println("\nChoose your carnivore:\n1.) Velociraptor\n2.) Carnotaurus ");
                  
                dinoChoice = sc2.nextLine();
                dinoChoice = dinoChoice.toLowerCase().trim();
                sc2.close();
                if(dinoChoice.equals("1") || dinoChoice.equals("velociraptor") || dinoChoice.equals("velo")){
                    Creature velo = new Velociraptor();
                    System.out.println("You chose Velociraptor!");
                    velo.printInfo();
                    dinoChoice = "Velociraptor";
                    x++;
                }
                else if(dinoChoice.equals("2") || dinoChoice.equals("carnotaurus") || dinoChoice.equals("carno")){
                    Creature carno = new Carnotaurus();
                    System.out.println("You chose Carnotaurus!");
                    carno.printInfo();
                    dinoChoice = "Carnotaurus";
                    x++;
                }
                else{
                    System.out.println("Invalid dinosaur choice, please try again!");
                    //return "1";
                    continue;
                }
            }
        }
        else if(dietChoice.equals("herbivore") || dietChoice.equals("herbi")){
            System.out.println("Playable herbivores are currently under construction! In the meantime, please choose a carnivore to play as!");
        }
        else{
            System.out.println("Invalid diet selection, please try again!");
            return "1";
        }
        return dinoChoice;
        
    }
}

