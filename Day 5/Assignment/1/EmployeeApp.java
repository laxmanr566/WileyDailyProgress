

import java.util.Arrays;

public class EmployeeApp {
	
	
	public static void sortEmployee(Employee arr[]) {
		Arrays.sort(arr);
	}

	private static void searchEmployee(Employee[] emp, String dept) {
		// TODO Auto-generated method stub
		for(Employee e:emp) {
			if(e.getEmpDept().equals(dept)) {
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args) {
	//declaring the Employee array
	Employee emp[]=new Employee[5];
	
	//intializing and adding data to the array
	emp[0] = new Employee(99,"Sameed","Testing",30000);
	emp[1] = new Employee(29,"Mani","Management",35000);
	emp[2] = new Employee(2,"laxman","Development",58000);
	emp[3] = new Employee(434,"Pavani","Maintanance",22000);
	emp[4] = new Employee(33,"Somu","Development",88000);
	
	
	// objects are sorted using Arrays class sort method
	EmployeeApp.sortEmployee(emp);
	
	//printing all employee in Testing dept
	System.out.println("----------Printing all employees in dept Testing--------");
	searchEmployee(emp,"Testing");
	
	System.out.println("\n-----------------Printing all employee in ascending order of gross salary-------------------\n");
	//arrays are printed one after another after sorting
	for(Employee e:emp) {
		System.out.println(e+"\n");
	}
	}

}
