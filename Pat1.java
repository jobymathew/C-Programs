import java.util.*;
class Pat1{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        lay(n);
    }
    static void lay(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}