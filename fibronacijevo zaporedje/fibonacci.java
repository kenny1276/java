import java.util.*;

public class fibonacci
{
  
  public static void main(String[] args)
  {
   Scanner s = new Scanner(System.in);
   System.out.println("Vpisi stevilo: ");
   int n=s.nextInt();
   int c[];
   c = new int [n];
   c[0]=1; c[1]=1;
   System.out.print("Fibonaccijevo zaporedje :"+ n +" stevil je :"+ c[0]+" "+c[1]);
   int i=2;
   while(i<n){
     c[i]=c[i-1]+c[i-2];
     System.out.print(" " +c[i]);
     i++;
  	}	
  }
}