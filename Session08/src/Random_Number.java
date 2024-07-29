import java.util.Random;

public class Random_Number {
    Random rand = new Random();
    int randomNum;

    public Random_Number() {
        this.randomNum = rand.nextInt(100) + 1;
    }

    public int getRandomNum() {
        return this.randomNum = rand.nextInt(100) + 1;

    }
}
