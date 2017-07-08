import java.util.*;
 public class M2 {
   public static void main(String args[]) { 
  
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int temp=a;
  int rem=0,i=0,sum=1;
  //int []b=new int[100];
  while(a!=0)
  {
      
   sum=sum*a;
      
      a=a-1;
      }if(sum!=0)
      System.out.println("factorial of "+temp+" is "+sum);
      
          }
          
      
    
} 
