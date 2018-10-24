import java.util.*;
class Father{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of members");
        int n = sc.nextInt();
        System.out.println("Enter the son and father");
        Map<String,String> m = new HashMap<String,String>();
        for(int i=0;i<n;i++){
            String k = sc.next();
            String l = sc.next();
            m.put(k,l);
        }
        int c = 0;
        for(Map.Entry<String,String> entry: m.entrySet()){
            if(entry.getValue() == m.get(getKey(m, "ronaldo"))){
                c++;
            }
        }
    }
    static <K,V> K getKey(Map<K,V> m, V value){
        for(Map.Entry<K,V> entry: m.entrySet()){
            if(value.equals(entry.getValue())){
                return entry.getKey();
            }
        }
    }
}