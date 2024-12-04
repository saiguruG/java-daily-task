package javaproject;
class Grandfather
{
	public void showG()
	   {
		System.out.println("He is the grandfather");
		}
}
	class father extends Grandfather
	{
		public void showF() 
		{
			System.out.println("He is the father");
		}
	}
		class son extends father
		{
			public void showS()
			{
		       System.out.println("He is the son");
		}
	
		
		}
	
public class HybridInharitance extends father {


      public void showD() {
    	  System.out.println(" She is the daughter");
      }
      public static void main (String[]args) {
    	  son obj = new son ();
    	  obj.showS();
    	  obj.showF();
    	  obj.showG();  
    	  
    	  HybridInharitance obj2 =new HybridInharitance();
    	  obj.showS();
    	  obj2.showD();
    	  obj2.showF();
    	  obj2.showG();
    	 }
}

	
      

