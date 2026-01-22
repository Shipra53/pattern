import java.util.Scanner;
//Write a C program to print a number triangle in which each row contains the row number repeated as many times as the row number
public class PrintNumberRT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
