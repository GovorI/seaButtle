import java.util.Random;

public class Ship {
    int positionX;
    int positionY;
    Random random = new Random();

    public Ship() {
        this.positionX = random.nextInt(10);
        this.positionY = random.nextInt(10);
    }
}
