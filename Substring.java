import java.util.*;
class Substring{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        String su = sc.next();
        int f=0;
        int k = su.length();
        for(int i=0;i<(s.length()-su.length());i++){
            if(s.substring(i,i+k).equals(su)){
                System.out.println(i);
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.println(-1);
        }
        sc.close();
    }
}
