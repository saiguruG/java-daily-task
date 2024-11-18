package javaproject;
import java.util.Scanner;

public class leapyearchecker {
	public static void main(String[]args) {
	Scanner object =new Scanner(System.in);
	
	System.out.println("enter the year: ");
	
	int year = object.nextInt();
	//if(yeae% 4==a&& year%100!=a)\\(year%400==0))
	
		if (year % 4 == 0 && year%100!=0){
			
			System.out.println(year+ "   It is leap year: "); 
	
		}else { 
	
		System.out.println( year + "    It not a leap year:" );
		
	}
	
  
}}
