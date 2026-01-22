import java.util.Scanner;
//print a center-aligned number pyramid where the number of rows is given by the user.

public class printpyramidno {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n;
        n=sc.nextInt();
         for (int i = 1; i <= n; i++) {  
            for (int s = n; s > i; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) 
                {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }  
}
