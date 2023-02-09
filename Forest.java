public class Forest {
    private static String name = "Plains";
    private static int chickenSpawnRate = 45;
    private static int puddleSpawnRate = 8;
    private static int goatSpawnRate = 25;
    private static int goreSpawnRate = 25;
    private static int boarSpawnRate = 15;
    private static int tenontosaurusSpawnRate = 8;
    
    public Forest(String name, int chickenSpawnRate){
        this.name = name;
        setChickenSpawnRate(chickenSpawnRate);
    }
    
    public static String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static int getChickenSpawnRate() {
        return chickenSpawnRate;
    }
    public void setChickenSpawnRate(int chickenSpawnRate) {
        this.chickenSpawnRate = chickenSpawnRate;
    }
    
    public static int getPuddleSpawnRate() {
        return puddleSpawnRate;
    }
    public void setPuddleSpawnRate(int chickenSpawnRate) {
        this.puddleSpawnRate = puddleSpawnRate;
    }
    
    public static int getGoatSpawnRate() {
        return goatSpawnRate;
    }
    public void setGoatSpawnRate(int chickenSpawnRate) {
        this.goatSpawnRate = goatSpawnRate;
    }
    
    public static int getGoreSpawnRate() {
        return goreSpawnRate;
    }
    public void setGoreSpawnRate(int goreSpawnRate) {
        this.goreSpawnRate = goreSpawnRate;
    }
    
    public static int getBoarSpawnRate() {
        return boarSpawnRate;
    }
    public void setBoarSpawnRate() {
        this.boarSpawnRate = boarSpawnRate;
    }
    
    public static int getTenontosaurusSpawnRate() {
        return tenontosaurusSpawnRate;
    }
    public void setTenontosaurusSpawnRate() {
        this.tenontosaurusSpawnRate = tenontosaurusSpawnRate;
    }
}