
class Employee {

	int i=0;
	Employee(int i){
	this.i=i;
}
}
public class EmployeeApp{
	public static void ChnageRef(Employee e) {
		Employee a = new Employee(20);
		e=a;
	}
	public static void main(String args[]) {
		Employee e =new Employee(10);
		ChnageRef(e);
		System.out.println(e.i);
		
	}
}