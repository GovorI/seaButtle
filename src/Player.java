import java.util.Scanner;

public class Player {
    int shootX, shootY;

    public Player() {
        System.out.println("Введите координату X: ");
        Scanner scanner = new Scanner(System.in);
        this.shootX = scanner.nextInt();
        System.out.printf("Вы ввели: %d\n", shootX);

        System.out.println("Введите координату Y: ");
        this.shootY = scanner.nextInt();
        System.out.printf("Вы ввели: %d\n", shootY);


    }
}
