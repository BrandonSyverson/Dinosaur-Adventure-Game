public class Velociraptor extends Creature {
    private static String name = "Velociraptor";
    private static int health = 60;
    private static int speed = 65;
    private static int food = 2;
    private static int attack = 20;
    private static int maxHealth = 60;
    
    @Override
    public void printInfo(){
        System.out.println("Velociraptor is a small and agile carnivore that uses it's large toe claws \nto quickly dispatch foes.");
    }
    
    public static String getName() {
        return name;
    }
    public static int getHealth() {
        return health;
    }
    public static int getSpeed() {
        return speed;
    }
    public static int getFood() {
        return food;
    }
    public static int getAttack() {
        return attack;
    }
    public static int getMaxHealth() {
        return maxHealth;
    }
    
}