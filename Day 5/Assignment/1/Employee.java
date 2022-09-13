import java.util.Arrays;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String empName;
	private String empDept;
	private double empBasicSalary;
	private double empGrossSalary;
	public Employee(int empId, String empName, String empDept, double empBasicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
		this.empGrossSalary = calculateGrossSalary( empBasicSalary);
		
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public double getEmpGrossSalary() {
		return empGrossSalary;
	}

	public void setEmpGrossSalary(double empGrossSalary) {
		this.empGrossSalary = empGrossSalary;
	}

	public double getEmpBasicSalary() {
		return empBasicSalary;
	}

	

	private double calculateGrossSalary(double empBasicSalary) {
		// TODO Auto-generated method stub
		double HRA=((empBasicSalary/100)*12);
		double DA=((empBasicSalary/100)*8);
		return empBasicSalary+HRA+DA;
	}
	
	@Override
	public String toString() {
		return "empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empGrossSalary=" + empGrossSalary + "]";
	}

	//an unimplemented method from comparable interface which return 1 if current object is higher or else -1 and 0 if both are equal
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int)(this.getEmpGrossSalary()-o.getEmpGrossSalary());
	}
	
	
}
