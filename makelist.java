import java.util.*;
class List{
    public static void main(String sr[]){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(7);
        int k = Collections.max(a);
        System.out.print(k);
    }
}