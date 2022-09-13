
public class EmployeeApp {
public static void main(String... args) {
	Employee e=new Employee();
	e.setEmpId(200);
	e.setEmpName("laxman Ramancha");
	e.setAddress(new Address("3-15","sc colony","gannervaram","karimnagar","telengana",505530));
	
	System.out.println("Id : "+e.getEmpId()+" \nName : "+e.getEmpName()+"\nAddress : "+e.getAddress());
}
}
