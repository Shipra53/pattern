import java.util.Scanner;

public class PrintHollowDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n-1;
        //int i,j,s;
        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= s; j++) {
            System.out.print(" ");
        }
        s--;
        for (int k = 1; k <= 2 * i - 1; k++) {
            if (k == 1 || k == 2 * i - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    s = 1;
    for (int i = 1; i <= n - 1; i++) {
        for (int j = 1; j <= s; j++) {
            System.out.print(" ");
        }
        s++;
        for (int k = 1; k <= 2 * (n - i) - 1; k++) {
            if (k == 1 || k == 2 * (n - i) - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.println();
    }
        
}
}
