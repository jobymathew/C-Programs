import java.util.*;
class Editdistance{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int dp[][] = new int[s1.length()][s2.length()];
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(i==0){
                    dp[i][j] = j;
                }
                else if(j==0){
                    dp[i][j] = i;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = 1 + min(dp[i][j-1],dp[i-1][j],dp[i-1][j-1]);
                }
            }
        }
        System.out.println(dp[s1.length()-1][s2.length()-1]);
    }

    static int min(int a,int b,int c){
        if(a<b && a<c){
            return a;
        }else if(b<c){
            return b;
        }else{
            return c;
        }
    }
}
