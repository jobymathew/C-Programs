import java.util.*;
class Isogram{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
        String s1 = sc.next();
        String s = s1.toLowerCase();
        ArrayList<Character> h = new ArrayList<Character>();
        int f = 0;
        for(int i=0;i<s.length();i++){
            if(h.contains(s.charAt(i))){
                f=1;
            }else{
                h.add(s.charAt(i));
            }
        }
        if(f==1){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
        n--;
        f=0;
    }

}

}