import java.util.Scanner;
import java.util.Arrays;
class StockRecords{
    public void enter_record(){
    int n, optn;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of companies");
	 n = sc.nextInt();
	 double sp[] = new double[n];
	 boolean ans[] = new boolean[n]; 
	 //System.out.println(n);	
	 for(int i = 0; i< n; i++)
	 {
	     System.out.println("Enter Stock Price of the company " + (i+1));
	     sp[i] = sc.nextDouble();
	     System.out.println("whether the company's stock price rose today compare to yesterday?");
	     ans[i] = sc.nextBoolean();
	 }
    
	 System.out.println("-------------------------------------");
	 System.out.println("Enter the Operations you want to perform");
	 System.out.println("1. Display the companies stock prices in ascending order");
	 System.out.println("2. Display the companies stock prices in descending order");
	 System.out.println("3. Display the total no. of companies for which the stock prices rose today ");
 	 System.out.println("4. Display the total no. of companies for which the stock prices decline today ");
	 System.out.println("5. Search a Specific stock price");
	 System.out.println("6. Press 0 to exit");
	 System.out.println("-------------------------------------");
	 optn = sc.nextInt();
	 
	 
	 switch(optn){
	     case 0:
	         System.out.println("Exited successfully");
	         break;
	     case 1:
	         Arrays.sort(sp);
	         System.out.println("Stock prices in ascending order are :");
	         for(int i = 0; i < n; i++)
	         {
	            System.out.println(sp[i]);
	         }
	         break;
	   case 2:
	       double temp;
	       for(int i = 0; i < n; i++)
	       for(int j = i+1; j < n; j++){
	         {
	            if(sp[i] < sp[j]){
	                temp = sp[i];
	                sp[i] = sp[j];
	                sp[j] = temp;
	            }
	         }
	       }
	       System.out.println("Stock prices in descending order are :");

	        for(int i = 0; i < n; i++)
	         {
	            System.out.println(sp[i]);
	         }
	       break;
	   case 3:
	       int inc_count = 0;
	       for(int i = 0; i < n; i++)
	         {
	             if(ans[i] == true)
	             {
	                 inc_count++;
	             }
	         }
	      System.out.println("Total no of companies whose stock price rose today :" + inc_count);
	       break;
	   case 4:
	       int dec_count = 0;
	       for(int i = 0; i < n; i++)
	         {
	             if(ans[i] == false)
	             {
	                 dec_count++;
	             }
	         }
	      System.out.println("Total no of companies whose stock price declined today :" + dec_count);
	       break;
	   case 5:
	       double value;
	       System.out.println("enter the key value");
	       value = sc.nextDouble();
	       for(int i = 0; i < n; i++)
	         {
	             if(sp[i] == value){
	                 System.out.println("Stock value " + value +" is present");
	                 break;
	             }
	             else{
	                 System.out.println("Stock value " + value +" is not present");
	                 break;
	             }
	         }
	       break;
	 }
	 
	 }
}


public class Stockers
{
	public static void main(String[] args) {
	 StockRecords sr = new StockRecords();
	 sr.enter_record();
	}
}
