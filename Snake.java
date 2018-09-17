import java.util.*;
import java.util.HashMap;
import java.util.Map;
class Snake
{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        Map< Integer,Integer > snake= new HashMap<Integer,Integer>();
        Map< Integer,Integer > ladder= new HashMap<Integer,Integer>();
        snake.put(30,5);
        snake.put(67,34);
        snake.put(52,14);
        snake.put(94,63);
        ladder.put(11,58);
        ladder.put(23,78);
        ladder.put(45,89);
        ladder.put(5,27);
        boolean p = true;
        int a,n,m1=1,m2=1;
        while(true){
            if(p == true){
            System.out.println("Player 1 plays press 1");
            a=sc.nextInt();
            n=rand();
            System.out.println("Dice "+n);
            if(m1+n<100){
            if(snake.containsKey(m1+n)){
                System.out.println("Snake!");
                m1=snake.get(m1+n);
            }else if(ladder.containsKey(m1+n)){
                System.out.println("Ladder!");
                m1=ladder.get(m1+n);
            }else{
                m1+=n;
            }
            }
            else if(m1+n==100){
                System.out.println("Player 1 wins!");
                System.exit(0);
            }
                       
            
            System.out.println("Player 1 is "+m1);
            System.out.println("Player 2 is "+m2); 
            if(n==6){
                p=true;
            }else{
                p=false;
            }
        }else{
            System.out.println("Player 2 plays press 1");
            a=sc.nextInt();
            n=rand();
            System.out.println("Dice "+n);
            if(m2+n<100){
            if(snake.containsKey(m2+n)){
                System.out.println("Snake!");
                m2=snake.get(m2+n);
            }else if(ladder.containsKey(m2+n)){
                System.out.println("Ladder!");
                m2=ladder.get(m2+n);
            }else{
                m2+=n;
            }
            }
            else if(m2+n==100){
                System.out.println("Player 2 wins!");
                System.exit(0);
            }
            
            System.out.println("Player 1 is "+m1);
            System.out.println("Player 2 is "+m2); 
            if(n==6){
                p=false;
            }else{
                p=true;
            }
        }
        }
    }
    static int rand(){
        return (int)(1+(6*Math.random()));
    }
}