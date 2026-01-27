import java.util.Scanner;

public class PrintRhombus {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        int n;
        //int i,j,s;
        n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" "); // Print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // Print stars
            }
            System.out.println(); // Move to the next line
        }

            // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // Print stars
            }
        System.out.println(); // Move to the next line
        }
    }
}
