import java.util.*;
import java.util.Arrays;
class Rev{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string 1 ");
        String S1 = sc.next();
        System.out.println("Enter the string 2");
        String S2 = sc.next();
        System.out.println("Enter the shuffled string");
        String sh = sc.next();
        String a1 = sort(S1);
        String a2 = sort(S2);
        String c = a1+a2;
        String f = sort(c);
        String d = sort(sh);
        if( f.equals(d)){
            System.out.println("It's correct");
        }else{
            System.out.println("It's wrong");
        }
    }
    // static String sort( String a ){
    //     char b[] = new char[a.length()];
    //     char t;
    //     int m,k;
    //     for(int i=0;i<a.length();i++){
    //         b[i] = a.charAt(i);
    //     }
    //     for(int j=0;j<a.length();j++){
    //     k = (int)(a.charAt(j));
    //     for(int i=1;i<a.length();i++){
    //         m = (int)(a.charAt(i));
    //         if(m<k){
    //             t = b[i];
    //             b[i] = b[j];
    //             b[j] = t;
    //         }  
    //     }
    //     }
    //     String S=" ";
    //     for(int i=0;i<a.length();i++){
    //          S = S+b[i];
    //     }
    //     S.trim();
    //     return S;
    // }
    static String sort( String a ){
        char b[]=a.toCharArray();
        Arrays.sort(b);
        return new String(b);
    }
}