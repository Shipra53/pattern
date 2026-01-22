import java.util.Scanner;
//print a hollow square using numbers with increasing and decreasing sequences 
public class PrintHollowSqNo {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r;
        r=sc.nextInt();
        //c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                if (i == 1) {
                    System.out.print(j + " ");
                } else if (i == r) {
                    System.out.print((r - j + 1) + " ");
                } else if (j == 1) {
                    System.out.print(i + " ");
                } else if (j == r) {
                    System.out.print((r - i + 1) + " ");
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
        sc.close();

    }
}
