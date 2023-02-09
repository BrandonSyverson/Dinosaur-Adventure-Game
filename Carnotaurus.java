public class Carnotaurus extends Creature {
    private static String name = "Carnotaurus";
    private static int health = 100;
    private static int speed = 50;
    private static int food = 3;
    private static int attack = 25;
    private static int maxHealth = 100;
    
    @Override
    public void printInfo(){
        System.out.println("Carnotaurus, latin for 'meat-eating bull', is a medium sized and somewhat clumsy \ncarnivore that uses it's speed to charge foes. ");
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