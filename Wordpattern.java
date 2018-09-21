import java.util.*;
class Wordpattern{
    public static void pat(String s){
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++){
            c++;
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            if(i!=n-1){
            System.out.print(s.charAt(i));
            }
            for(int j=i+1;j<n-1;j++){
                System.out.print(" ");
            }
            System.out.print(s.charAt(n-1));
            for(int j=n-1;j<s.length();j++){
                System.out.print(" ");
            }
            n--;
            System.out.println();
        }
    for(int i=0;i<n+i;i++){
        if(c!=(n-1)){
        for(int j=0;j<n-1;j++){
            System.out.print(" ");
        }
        System.out.print(s.charAt(n-1));
        for(int j=n;j<c;j++){
            System.out.print(" ");
        }
        System.out.print(s.charAt(c));
        c++;
        n--;
        System.out.println();
    }
    }
}
    // System.out.print(s.charAt(n-1));
    // for(int j=n;j<c;j++){
    //     System.out.print(" ");
    // }
    // System.out.print(s.charAt(c));
    // System.out.println();
    // }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        pat(s);
    }   
}
