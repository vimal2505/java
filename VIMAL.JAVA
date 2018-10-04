import java.util.*;
class Main{
   public static void main(String[] args) {
     Scanner ka=new Scanner(System.in);
     float a;
     System.out.println("Enter the number");
     a=ka.nextInt();
     if(a==0)
     {
       System.out.println("Zero");
     }
     else if(a>0)
     {
       System.out.println("Positive");
     }
     else if(a<0)
     {
       System.out.println("Negative");
     }
     else
     {
       System.out.println("Invaild");
     }
   }

     