package javaproject;
import java.util.Scanner;

public class MultiplicationTable {

	    public static void main(String []args){
	Scanner table=new Scanner(System.in);

	System.out.println("enter the number between 1to 10: ");
	int number=table.nextInt();
	   if (number >= 1 && number <= 11) {
		for (int i=0;i<=10;i++) {
			System.out.println(number+"x" +i+"="+(number *i));
		
		} }else {
			System.out.println("please entere A NUMBER BETWEEN 1AND 10:  ");
	   }
	    }
	    }

