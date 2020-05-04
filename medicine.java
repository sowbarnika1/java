import java.io.*;
import java.util.*;
public class Main{

     public static void main(String []args){
       String medicineName,batchNo,disease,findDisease;
       int price ;
        Medicine[] n=new Medicine[4];
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<4;i++)
       {
           medicineName=sc.nextLine();
           batchNo=sc.nextLine();
           disease=sc.nextLine();
           price=sc.nextInt();
           sc.nextLine();
           n[i] =new Medicine(medicineName,batchNo,disease,price);
       }
       findDisease=sc.nextLine();
      check(n,findDisease);
     }
     public static void check(Medicine[] n,String findDisease)
     {
        for(int i=0;i<4;i++)
        {
            //System.out.println(n[i].getdisease());
           // System.out.println(findDisease);
            if(n[i].getdisease().equals(findDisease))
            {
             System.out.println(n[i].getprice());
            }
        }
     }
}
class Medicine{
    private String medicineName,batchNo,disease;
    private int price;
    Medicine(String medicineName,String batchNo,String disease,int price)
    {
        this.medicineName=medicineName;
        this.batchNo=batchNo;
        this.disease=disease;
        this.price=price;
    }
    public String getmedicineName()
    {
        return this.medicineName;
    }
    public void setmedicineName(String medicineName)
    {
        medicineName=this.medicineName;
    }
    public String getbatchNo()
    {
        return this.batchNo;
    }
    public void setbatchNo(String batchNo)
    {
        batchNo=this.batchNo;
    }
    public String getdisease()
    {
        return this.disease;
    }
    public void setdisease(String disease)
    {
        disease=this.disease;
    }
    public int getprice()
    {
        return this.price;
    }
    public void setprice(int price)
    {
        price=this.price;
    }
    
}
