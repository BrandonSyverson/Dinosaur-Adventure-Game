class Player{
    public int food;
    public int water;
    public int health;
    public int speed;
    public int score;
    public int attack;
    public int maxHealth;
    public String name;
    
    public Player(int food, int water, int health, int speed, int score, int attack, int maxHealth, String name){
        this.food = food;
        this.water = water;
        this.health = health;
        this.speed = speed;
        this.score = score;
        this.attack = attack;
        this.maxHealth = maxHealth;
        this.name=name;
    }
    
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
    
    public int getWater() {
        return water;
    }
    public void setWater(int water) {
        this.water = water;
    }
    
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    
    public int getMaxHealth() {
        return maxHealth;
    }
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public final String toString(){//d
        return String.format( "%s, %s, %s, %s" ,food , water, health, speed);
    }
}


