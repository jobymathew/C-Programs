import java.util.*;
import java.math.*;
class Weight{
    public static void main(String arg[]){
        System.out.println("Enter the number of numbers");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the numbers");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        weight(a);
    }
    public static void weight(int a[]){
        int sum[] = new int[a.length];
        for(int i=0;i<sum.length;i++){
            sum[i]=0;
        }
        for(int i=0;i<a.length;i++){
            if(perfect((double)a[i])){
                sum[i]+=5;
            }
            if(foursix(a[i])){
                sum[i]+=4;
            }
            if(even(a[i])){
                sum[i]+=3;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println("< "+a[i]+","+sum[i]+" >");
        }
    }
    public static boolean perfect(double n){
        double s = Math.sqrt(n);
        return ((s-Math.floor(s))==0);
    }
    static boolean foursix(int n){
        if(mf(n)&&div(n)){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean mf(int n){
        if(n%4==0){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean div(int n){
        if(n%6==0){
            return true;
        }else{
            return false;
        }
    }
    static boolean even(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
}
