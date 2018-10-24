import java.util.*;
class FW{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int size = 26;
        int fr[] = new int[size];
        for(int i=0;i<s.length();i++){
            fr[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(fr[s.charAt(i)-'a']!=0){
                System.out.print(s.charAt(i));
                System.out.print(fr[s.charAt(i)-'a']+" ");
                fr[s.charAt(i)-'a'] = 0;
            }
        }
        System.out.println(s.charAt(0)-'a');
    }
}