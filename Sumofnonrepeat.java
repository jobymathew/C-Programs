import java.util.*;
class Sumofnonrepeat{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(!b.contains(a[i])){
                b.add(a[i]);
            }
        }
        int sum = 0;
        for(int i=0;i<b.size();i++){
            sum+=b.get(i);
        }
        System.out.print(sum);
    }
}