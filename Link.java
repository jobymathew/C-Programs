import java.util.*;
class Link{
    public static void main(String arg[]){
        LinkedList< String > ob = new LinkedList< String >();
        ob.add("Hey");
        ob.add("Nice");
        ob.addFirst("Eda");
        ob.addLast("Uyo");
        String m = ob.get(3); 
        System.out.println(m);
        for(int i=0;i<ob.size();i++){
            System.out.println(ob.get(i));
        }
    }
}