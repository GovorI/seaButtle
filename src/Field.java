public class Field {
    final int SIZE = 10;
    char[][] cells = new char[SIZE][SIZE];
    Ship ship;
    Player player;

    void init() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            cells[i][j] = '.';
            }
        }
    }

    void setShip(Ship ship) {
        this.ship = ship;
        cells[ship.positionX][ship.positionY] = 'o';
    }

    void doShoot(Player player) {
        this.player = player;
        switch (cells[player.shootX][player.shootY]) {
            case '.':
                System.out.println("Мимо!");
                cells[player.shootX][player.shootY] = '*';
                break;
            case '*':
                System.out.println("Уже стрелял сюда!");
                break;
            case 'o':
                System.out.println("Попал! Ты победитель!");
                cells[player.shootX][player.shootY] = 'x';
                break;
        }
    }

    void show() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(cells[i][j]);
            }
            System.out.println();
        }
    }

    boolean isNotGameOver() {
        return cells[ship.positionX][ship.positionY] == 'o';
    }
}
