import java.util.*;
public class printhollowsquare {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r;
        r=sc.nextInt();
        //c=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                if(i==0 || i==r-1||j==0||j==r-1){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
