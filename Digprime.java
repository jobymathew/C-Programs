import java.util.*;
class Digprime{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int c = 0;
        for(int i=l;i<=r;i++){
            if(prim(i)){
                c++;
            }
        }
        System.out.println(c);
    }
    static boolean prim(int n){
        int r,sum=0;
        while(n>0){
            r=n%10;
            sum+=r;
            n=n/10;
        }
        if(sum==1){
            return false;
        }
        int c=0;
        for(int i=2;i<sum;i++){
            if(sum%i==0){
                c++;
            }
        }
        if(c>0){
            return false;
        }else{
            return true;
        }
    }
}