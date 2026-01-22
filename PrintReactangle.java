import java.util.Scanner;

public class PrintReactangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
