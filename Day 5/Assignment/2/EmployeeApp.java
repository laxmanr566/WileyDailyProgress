

import java.util.Arrays;

public class EmployeeApp {
	
	
	
	
	public static void main(String[] args) {

		
		Employee e1=new Employee(2,"laxman","Development",58000);
		Employee e2=new Employee(2,"laxman","Development",58000);
		Employee e3=new Employee(33,"Somu","Development",88000);
		
		
		//checking e1 with e2:
		System.out.println(e1.equals(e2));
		//checking e2 with e3
		System.out.println(e2.equals(e3));
		
	}

}
