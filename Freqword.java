import java.util.*;
class Freqword{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character,Integer> m = new HashMap<Character,Integer>();
        int n = 1;
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                increment(m,s.charAt(i));
            }else{
                m.put(s.charAt(i),1);
            }
        }
        Set keys = m.keySet();

   for (Iterator i = keys.iterator(); i.hasNext(); ) {
       char key = (char) i.next();
       int value =  m.get(key);
       System.out.println(key + " = " + value);
   }
    }
    static void increment(HashMap<Character,Integer> m, char a){
        int c = m.get(a);
        m.put(a, c+1);
    }
}