public abstract class Creature {
    private static String name;
    private static int health;
    private static int attack;
    private static int speed;
    private static int food;
    private static int maxHealth;
    
    public abstract void printInfo();
    
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