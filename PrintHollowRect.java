import java.util.Scanner;
//Print a hollow rectangle
public class PrintHollowRect {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 || i==r-1||j==0||j==c-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
