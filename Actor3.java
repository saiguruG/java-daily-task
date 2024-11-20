package javaproject;
import java.util.Scanner;

public class Actor3 {
public static void main(String[]args) {
	String Actor;
	Scanner obj = new Scanner(System.in);
	System.out.println("enter the name of the actor: ");
	 Actor =obj.nextLine();
	switch(Actor){ 
	case "vijay":{
		System.out.println("the actor name is vijay: ");
		
	System.out.println("please enter the number of the flim : ");
	  int num=obj.nextInt();
	
		switch(num){
		case 1:
			System.out.println("thirupachi");
			System.out.println();
			System.out.println("the movie is blackbuster");
			break;
		case 2:
			System.out.println("Soora");
			System.out.println();
			System.out.println("the movie is flop");
			break;
		case 3:
			System.out.println("kuruvi");
			System.out.println();
			System.out.println("the movie is blackbuster.");
			break;
		case 4:
			System.out.println("Thupaki");
			System.out.println();
			System.out.println("the movie is blackbuster.");
		case 5:
			System.out.println("Beast");
			System.out.println();
			System.out.println("the movie is flop");
			break;
		default:
			System.out.println(" please enter the correct film number");}
			break;}
			default:
				System.out.println(" please enter the correct Actor name:");
				break;
		
	case "rajinikanth":
		System.out.println("the actor name is rajinikanth: ");
		System.out.println();
		System.out.println("please enter the number of the flim : ");
		  int okok=obj.nextInt();
		
			switch(okok){
			case 1:
				System.out.println("ANNAMALAI");
				System.out.println();
				System.out.println("the movie is blackbuster");
				break;
			case 2:
				System.out.println("ANNATHE");
				System.out.println();
				System.out.println("the movie is flop");
				break;
			case 3:
				System.out.println("JAILER");
				System.out.println();
				System.out.println("the movie is blackbuster.");
				break;
			case 4:
				System.out.println("VETAIYAN");
				System.out.println();
				System.out.println("the movie is blackbuster.");
			case 5:
				System.out.println("LINGA");
				System.out.println();
				System.out.println("the movie is flop");
				break;
			default:
				System.out.println(" please enter the correct film number");}
		       break;
	case"kamal":
		System.out.println("the actor name is kamal: ");
		System.out.println();
		System.out.println("please enter the number of the flim : ");
		  int ok=obj.nextInt();
		
			switch(ok){
			case 1:
				System.out.println("VIKRAM");
				System.out.println();
				System.out.println("the movie is blackbuster");
				break;
			case 2:
				System.out.println("VASULRAJA");
				System.out.println();
				System.out.println("the movie is flop");
				break;
			case 3:
				System.out.println("DHASAVATHARAM");
				System.out.println();
				System.out.println("the movie is blackbuster.");
				break;
			case 4:
				System.out.println("THEVAR MAGAN");
				System.out.println();
				System.out.println("the movie is blackbuster.");
			case 5:
				System.out.println("HEY RAM");
				System.out.println();
				System.out.println("the movie is flop");
				break;
				default:
					System.out.println(" please enter the correct film number");
				}break;
		
		
	}

}}

