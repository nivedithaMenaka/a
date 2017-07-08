import java.util.*;
 public class M1 {
   public static void main(String args[]) { 
  
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int temp=a;
  int rem=0,i=0,sum=0;
  //int []b=new int[100];
  while(a!=0)
  {
      rem=a%10;
   sum=sum*10+rem;
      
      a=a/10;
      }if(temp==sum)
      System.out.println(temp+" is a plaindrome");
      else
          System.out.println(temp+" is not a plaindrome");
          }
          
      
    
} 
