import java.util.*;
class Coin{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[k];
        for(int i=0;i<k;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(count(a,k,n));
    }
    static int count(int a[], int k, int n){
        if(n==0){
            return 1;
        } if(n<0){
            return 0;
        }
        if(k<=0&&n>=1){
            return 0;
        }
        return count(a,k-1,n) + count(a, k, n-a[k-1]);
    }
}