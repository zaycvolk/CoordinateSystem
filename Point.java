import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            coplane(10, 10);
        }
    }

    public static void coplane(int o, int p) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x >= 10 || x < 0) {
            return;
        }
        int y = scanner.nextInt();
        if (y >= 10 || y < 0) {
            return;
        }
        System.out.print("0");
        for (int i = 1; i < o; i++) {
            System.out.print("  " + i);
        }
        System.out.println();
        for (int j = 1; j < p; j++) {
            System.out.print(j);
            for (int t = 1; t < p; t++) {
                if (j == y && t == x) {
                    System.out.print("  *");
                } else {
                    System.out.print("  .");
                }
            }
            System.out.println();
        }
    }
}
