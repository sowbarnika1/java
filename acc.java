import java.io.*;
import java.util.*;
class Main
{
    public static void main (String[] args) {
    
        /*Scanner sc=new Scanner(System.in);
        int num,noofholders;
        String type;
        double balance;*/
        Account account1= new Account(7,"ewqkvae",168.0,67);
        Account account2= new Account(3,"mqclvcm",123.0,74);
        Account account3= new Account(57,"uenzjpt",164.0,98);
        Account account4= new Account(28,"hwzlblz",130.0,5);
        Account account5= new Account(4,"rmejckg",125.0,28);
        Account[] obj={account1,account2,account3,account4,account5};
        Account accountRes1= new Account(31,"mcxdkjh",701.0,64);
        boolean result= replaceAccountByNumber(obj, accountRes1);
        System.out.println(result);
        Account accountRes2= new Account(7,"zgcerte",224.0,29);
        result= replaceAccountByNumber(obj, accountRes2);
            System.out.println(result);

        
    }
    static boolean replaceAccountByNumber(Account[] obj,Account n)
    {
        for(int i=0;i<5;i++)
        {
           // System.out.println(obj[i].getnum()+" "+n);
            if((obj[i].getnum()==n.getnum()) && (obj[i].gettype().equals(n.gettype()) && obj[i].getbalance==n.getbalance()) && obj[i].getnoofholders()==n.getnoofholders()))
            {
                return true;
            }
            
        }
        return false;
    }
    
}
class Account
{
      private  int num,noofholders;
      private  String type;
      private  double balance;
      Account(int num,String type,double balance,int noofholders)
      {
          this.num=num;
          this.type=type;
          this.balance=balance;
          this.noofholders=noofholders;
      }
      void setnum(int num)
      {
          this.num=num;
      }
      int getnum()
      {
          return this.num;
      }
      void settype(String type)
      {
          this.type=type;
      }
      String gettype()
      {
          return this.type;
      }
      void setbalance(int balance)
      {
          this.balance=balance;
      }
       double getbalance()
      {
          return this.balance;
      }
      void setnoofholders(int noofholders)
      {
          this.noofholders=noofholders;
      }
      int getnoofholders()
      {
          return this.noofholders;
      }
}
      
