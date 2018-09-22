import java.util.*;
class Train{
    Scanner sc = new Scanner(System.in);
    int trainno;
    int n;
    String cus[] = new String[100];
    int i =0;
    public void addTrain(){
        System.out.println("Enter train number");
        trainno = sc.nextInt();
        System.out.println("Enter the number of seats");
        n = sc.nextInt();
        System.out.println();
    }
    public boolean search(int tr){
        if(tr == trainno){
            return true;
        }else{
            return false;
        }
    }
    public void Book(){
        if(i<n){
            System.out.println("Seats availabe: "+(n-i));
            System.out.println("Enter the number of seats");
            int k = sc.nextInt();
            if((k+i)<=n){
            for(int j=i;j<(k+i);j++){
                System.out.println("Enter the name of passenger "+(j+1));
                cus[j] = sc.next();
            }
            i+=k;
        }else{
            System.out.println("Seats unavailabe");
        }
    }else{
        System.out.println("Seats full");
    }
    System.out.println();
    }
    public void availabe(){
        if(i<n){
            System.out.println("Seats available: "+(n-i));
        }else{
            System.out.println("Full");
        }
        System.out.println();
    }
    public void cancel(){
        if(i>0){
        System.out.println("Enter the name to be canceled");
        String nam = sc.next();
        int f = 0;
        for(int j=0;j<i;j++){
            if(nam.equals(cus[j])){
                f=1;
                cus[j] = cus[i-1];
                i--;
                break;    
            }
        }
        if(f==0){
            System.out.println("Name not found");
        }
    }else{
        System.out.println("No bookings");
    }
    System.out.println();
    }
    public void preparechart(){
        System.out.println("Train number "+trainno);
        if(i>0){
        for(int j=0;j<i;j++){
            System.out.println(cus[j]);
        }
    }else{
        System.out.println("No bookings");
    }
    System.out.println();
    }
}
class TRes{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of trains");
        int no = sc.nextInt();
        Train t[] = new Train[no];
        for(int j=0;j<no;j++){
            t[j] = new Train();
            t[j].addTrain();
        }
        int ch=0;
        while(ch!=5){
            System.out.println("Railway System\n\n");
            System.out.println("1.Booking");
            System.out.println("2.Avaliability");
            System.out.println("3.Cancellation");
            System.out.println("4.Chart");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            System.out.println();
            int f=0;
            switch(ch){
                case 1:
                System.out.println("Enter train no");
                int tr = sc.nextInt();
                for(int j=0;j<no;j++){
                if(t[j].search(tr)){
                    f=1;
                    t[j].Book();
                }
                }
                if(f==0){
                System.out.println("Train not found");
                } 
                break;
                case 2:
                System.out.println("Enter train no");
                tr = sc.nextInt();
                for(int j=0;j<no;j++){
                if(t[j].search(tr)){
                    f=1;
                    t[j].availabe();
                }
                }
                if(f==0){
                System.out.println("Train not found");
                }  
                break;
                case 3:
                System.out.println("Enter train no");
                tr = sc.nextInt();
                for(int j=0;j<no;j++){
                if(t[j].search(tr)){
                    f=1;
                    t[j].cancel();
                }
                }
                if(f==0){
                System.out.println("Train not found");
                } 
                break;
                case 4:
                for(int j=0;j<no;j++){
                        t[j].preparechart();
                    }
                break;
                case 5:
                System.out.println("Thanks");
                break;
                default: System.out.println("Wrong choice");
            }
        }
        sc.close();
    }
}
