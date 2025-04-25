
import java.util.Scanner;
public class pattern {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter the Length : ");
        // int n=input.nextInt();
        int n = 5;
        // Right Half pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Left Half pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Full pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Inverted Right Half pyramid
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // inverted Left Half pyramid
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // inverted Full pyramid
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // Rhombus pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // diamond pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Hourglass pattern
        for (int i = n; i > 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Hollow square pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((j == 1) || (j == n) || (i == 1) || (i == n)) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        // Hollow Full pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((j == 1) || (j == i) || (i == 1) || (i == n)) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        // Hollow inverted Full pyramid
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((j == 1) || (j == i) || (i == 1) || (i == n)) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        // Hollow Diamond Pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((j == 1) || (j == i) || (i == 1)) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((j == 1) || (j == i) || (i == 1)) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        // Hollow hourglass pattern
        for (int i = n; i > 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((j == 1) || (j == i) || (i == 1) || (i == n)) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((j == 1) || (j == i) || (i == 1) || (i == n)) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        // Floyds's Triangle
        int count = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println();
        // Right Half pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        // Right Half pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

        // unknown
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Pascal's triangle

        input.close();
    }
}