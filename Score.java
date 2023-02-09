import java.io.Serializable;

public final class Score implements Serializable{
    private String name;
    private int score;

    public Score(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }
    public void setCity(int score) {
        this.score = score;
    }
    
    @Override
    public String toString() {
        return String.format("Dinosaur: %s   Score: %d", name, score);
    }
}
