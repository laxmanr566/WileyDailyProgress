
public class ParaConst {

	int empid;
	String empName;
	ParaConst(){
	}
	ParaConst(int empid,String empName){
		this.empid=empid;
		this.empName=empName;
	}
	public String toString() {
		return "emp id ="+empid+"emp Name"+empName;
	}
	
}
