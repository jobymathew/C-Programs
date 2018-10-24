import java.util.*;
class Lay{
    public static void layer(int n){
        int a[][] = new int[n][n];
        int k = n-2;
        int m = n-1;
        int o =n;
        for(int i=0;i<n;i++){
            for(int j=0;j<o;j++){
                a[i][j]=k;
                a[j][i]=k;
                a[m][j]=k;
                a[j][m]=k;
            }
            o--;
            k--;
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
    }
    System.out.println();
}
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        layer(n);
    }
}