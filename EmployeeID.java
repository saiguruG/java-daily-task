package javaproject;

public class EmployeeID {
	
	String name;
	int id;
    double salary;
    EmployeeID(String s, int d, double f )
    {
    	name=s;
    	id=d;
    	salary=f;
    	}
    void display() {
    	System.out.println("the name of the employee: "+name);
    	System.out.println("the id num of the employee: "+id);
    	System.out.println("the salary of the employee: "+salary);
    }
    public static void main(String args[]) {
    	
    	EmployeeID w1=new EmployeeID("saiguru G",2125,20000);
    	EmployeeID w2=new EmployeeID("subasri S",1721,30000);
    	w1.display();
        w2.display();
    	
    }
    	
    	
    
}
