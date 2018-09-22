 import java.util.*;
 class Banker{
     String accname;
     long accno;
     long bal;
     Scanner sc = new Scanner(System.in);
     public void add(String accname, long accno,long bal){
         this.accname = accname;
         this.accno = accno;
         this.bal = bal;
     }
     public void newAccount(){
         System.out.println("Enter the account number");
         accno = sc.nextLong();
         System.out.println("Enter the account name");
         accname = sc.next();
         System.out.println("Enter the balance");
         bal = sc.nextLong();
     }
     public long viewBalance(){
         return bal;
     }
     public void showAccount(){
         System.out.println(accname+"...."+accno+"....."+bal);
     }
     public void Deposit(){
         long amt;
         System.out.println("Enter the amount to be deposited");
         amt = sc.nextLong();
         bal = bal+amt;
     }
     public void Withdraw(){
         long amt;
         System.out.println("Enter the amount to be withdrawn");
         amt = sc.nextLong();
         if(bal-amt<0){
             System.out.println("Insufficient balance");
         }
         else{
             bal-=amt;
         }
     }
     public boolean search(long ac){
         if(accno == ac){
             showAccount();
             return true;
         }
         else{
             return false;
         }
     }
    }
     class Bank {
         public static void main(String arg[]){
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the number of accounts");
             int n = sc.nextInt();
             Banker c[] = new Banker[n];
             for(int i=0;i<n;i++){
                 c[i] = new Banker();
                 c[i].newAccount();
             }
             int ch =0;
             long at;
             while(ch!=5){
                 System.out.println(".......Banking System........");
                 System.out.println(".......1. View Accounts......");
                 System.out.println(".......2. Search.............");
                 System.out.println(".......3. Withdraw...........");
                 System.out.println(".......4. Deposit............");
                 System.out.println(".......5. Exit...............");
                 System.out.println("Enter your choice");
                 ch = sc.nextInt();
                switch(ch){
                    case 1: 
                    System.out.println("Name....AccountNumber....Balance");
                    for(int i=0;i<n;i++){
                        c[i].showAccount();
                    }break;
                    case 2:
                    System.out.println("Enter the account number");
                    long a = sc.nextLong();
                    int f =0;
                    for(int i=0;i<n;i++){
                        if(c[i].search(a)){
                            f=1;
                            break;
                        }
                    }
                        if(f==0){
                            System.out.println("Account not found");
                        }
                        break;
                    case 3:
                    System.out.println("Enter the account number");
                    at = sc.nextLong();
                    f=0;
                    for(int i=0;i<n;i++){
                        if(c[i].search(at)){
                            f=1;
                            c[i].Withdraw();
                            break;
                        }
                    }
                        if(f==0){
                            System.out.println("Account not found");
                        }
                        break;
                    case 4:
                    System.out.println("Enter the account number");
                    at = sc.nextLong();
                    f = 0;
                    for(int i=0;i<n;i++){
                        if(c[i].search(at)){
                            f=1;
                            c[i].Deposit();
                            break;
                        }
                    }
                        if(f==0){
                            System.out.println("Account not found");
                        }
                        break;
                    case 5:
                    System.out.println("Exiting");
                    break;
                    default: System.out.println("Wrong input");
                    }
                    }
                
             }

         }
     
 
