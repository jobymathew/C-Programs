import java.util.*;
class Treeset{
    public static void main(String arg[]){
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(2);
        t.add(56);
        t.add(24);
        t.add(2);
        t.add(34);
        System.out.println(t.first()+" "+t.last());
    }
}