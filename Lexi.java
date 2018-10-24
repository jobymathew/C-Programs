import java.util.*;
class Lexi{
    public static void main(String arg[]){
        String s[] = {"c","cb","cba"};
        int n = s.length;
        String an =getSmall(s,n);
        System.out.println(an);
    }
    static String getSmall(String s[], int n){
        sort(s,n);
        String an = " ";
        for(int i=0;i<n;i++){
            an += s[i];
        }
        return an;
    }
    static void sort(String s[], int n){
        String temp;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if((s[i]+s[j]).compareTo(s[j]+s[i])>0){
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
            }
        }
    }
}