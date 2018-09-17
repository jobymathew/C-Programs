import java.util.*;
import java.io.*;
class Mars{
    public static void main(String arg[]){
        System.out.println("Enter the rectangle size");
        int a=0;
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        System.out.println("Enter the intial position along with its direction (N,E,W,S)");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        char d = sc.next().charAt(0);
        char p[] = new char[100];
        System.out.println("Enter the number of directions");
        int n = sc.nextInt();
        System.out.println("Enter the directions");
        for(int i=0;i<n;i++){
            p[i]=sc.next().charAt(0);
        }
        int c1 = i1;
        int c2 = a2-i2;
        int d1 = c1;
        int d2 = c2;
        if(d == 'N'){
            a = 90; 
        }
        if(d == 'E'){
            a = 0; 
        }if(d == 'W'){
            a = 180; 
        }if(d == 'S'){
            a = 270; 
        }
        Mars ob = new Mars();
        ob.changeDir(a);
        for(int i=0;i<n;i++){
            if(p[i] == 'L'){
                if( a+90 < 360 ){
                    a+=90;
                }else{
                    a=0;
                }
                d = changeDir(a);
            }
            else if (p[i] == 'R'){
                if( a-90 > 0 ){
                    a-=90;
                }else if(a==0){
                    a=270;
                    }else{
                    a=0;                    
                }
                d = changeDir(a);
                }
                else{
                    if(a == 90){
                        c2++;
                    }if(a == 180){
                        c1--;                    
                    }if(a == 270){
                        c2--;                    
                    }else if( a == 0){
                        c1++;                     
                    }
                }
            }
                    int k1 = c1-d1;
                    int k2 = c2-d2;
                    i1 = i1+k1;
                    i2 = i2+k2;
            System.out.println("The new position is "+i1+" "+i2+" "+d);       
    }
    static char changeDir(int a){
        if(a==90){
            return 'N';
        }else if(a==180){
            return 'W';
        }else if(a==270){
            return 'S';
        }else{
            return 'E';
        }
    }
}