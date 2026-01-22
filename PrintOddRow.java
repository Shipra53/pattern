import java.util.Scanner;
//Print stars (*) only on odd-numbered rows 
public class PrintOddRow {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r;
        r=sc.nextInt();
       for (int i = 1; i <= r; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= r-1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
