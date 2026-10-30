package task5;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height (at least 2): ");
        int height = sc.nextInt();

        System.out.print("Enter width (at least 2): ");
        int width = sc.nextInt();

        if (height < 2 || width < 2) {
            System.out.println("Height and width must be at least 2.");
        } else {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= width; j++) {
                    if (i == 1 || i == height ||
                            j == 1 || j == width) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        sc.close();
    }
}

