import java.util.*;
class Taxi{
    Scanner sc = new Scanner(System.in);
    boolean status=false;
    String cus;
    int no;
    int n;
    String src,des;
    public void addTaxi(){
        System.out.println("Enter taxi no");
        n = sc.nextInt();
    }
    public void book(){
        if(status){
            System.out.println("Booked");
        }else{
            System.out.println("Enter your name");
            cus = sc.next();
            System.out.println("Enter your number");
            no = sc.nextInt();
            System.out.println("Enter the source");
            src = sc.next();
            System.out.println("Enter the destination");
            des = sc.next();
            System.out.println("We have booked your cab from "+src+" to "+des);
            System.out.println();
            status=true;
        }
    }
    public void cancel(){
        if(status){
            status=false;
            System.out.println("We have canceled your booking");
        }
        else{
            System.out.println("This taxi is not booked");
        }
    }
    public void status(){
        if(status){
            System.out.println("It's booked");
        }else{
            System.out.println("It's not booked");
        }
    }
    public boolean search(int num){
        if(num==n){
            return true;
        }else{
            return false;
        }
    }
    public void display(){
        if(status){
        System.out.println(n+cus+no+src+des);
        }else{
            System.out.println(n+"not booked");
        }
    }
}
class CTaxi{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of taxis");
        int n = sc.nextInt();
        Taxi ct[] = new Taxi[n]; 
        for(int i=0;i<n;i++){
            ct[i] = new Taxi();
            ct[i].addTaxi();
        }
        int ch = 0,k;
        while(ch!=5){
            System.out.println(".......Taxi System........");
                 System.out.println(".......1. Book......");
                 System.out.println(".......2. Cancel.............");
                 System.out.println(".......3. Status...........");
                 System.out.println(".......4. Show All............");
                 System.out.println(".......5. Exit...............");
                 System.out.println("Enter your choice");
                 ch = sc.nextInt();
            switch(ch){
                case 1: 
                System.out.println("Enter taxi number");
                k = sc.nextInt();
                for(int i=0;i<n;i++){
                    if(ct[i].search(k)){
                        ct[i].book();
                    }
                }
                break;
                case 2:
                System.out.println("Enter taxi number");
                k = sc.nextInt();
                for(int i=0;i<n;i++){
                    if(ct[i].search(k)){
                        ct[i].cancel();
                    }
                }
                break;
                case 3:
                System.out.println("Enter taxi number");
                k = sc.nextInt();
                for(int i=0;i<n;i++){
                    if(ct[i].search(k)){
                        ct[i].status();
                    }
                }
                break;
                case 4:
                for(int i=0;i<n;i++){
                    ct[i].display();
                }
                break;
                case 5: System.out.println("Exitting");
                break;
                default: System.out.println("Wrong choice");
            }
        }
        sc.close();
    }
}