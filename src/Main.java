public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Ship ship = new Ship();
        field.init();
        field.setShip(ship);

        System.out.println("Game Start");

        do {
            field.show();
            Player player = new Player();
            field.doShoot(player);


        } while (field.isNotGameOver());
    }
}
