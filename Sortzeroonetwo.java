import java.util.*;
class Sortzeroonetwo{
    public static void main(String arg[]){
        int a[] = {1,2,1,0,2,0,0,1,2,1};
        int l=0,h=a.length-1,m=0;
        int temp;
        while(m<=h){
            if(a[m]==0){
                temp = a[m];
                a[m] = a[l];
                a[l] = temp;
                m++;
                l++;
            }else if(a[m]==2){
                temp = a[m];
                a[m] = a[h];
                a[h] = temp;
                h--;
            }else{
                m++;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}