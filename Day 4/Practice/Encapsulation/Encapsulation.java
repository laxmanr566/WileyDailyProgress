
class EncapsulationDemoClass {
	private int cId;
	private String cName;
	private double cBal;
	private String address;
	EncapsulationDemoClass(){
	}
	public EncapsulationDemoClass(int cid, String cName, double cBal, String address) {
		super();
		this.cId = cid;
		this.cName = cName;
		this.cBal = cBal;
		this.address = address;
	}
	public int getCId() {
		return cId;
	}
	public void setCId(int cid) {
		this.cId = cid;
	}
	public String getCName() {
		return cName;
	}
	public void setCName(String cName) {
		this.cName = cName;
	}
	public double getCBal() {
		return cBal;
	}
	public void setCBal(double cBal) {
		this.cBal = cBal;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
}
public class Encapsulation{
	public static void main(String args[]) {
		EncapsulationDemoClass ecd1 =new EncapsulationDemoClass();
		EncapsulationDemoClass ecd2 =new EncapsulationDemoClass(1,"laxman",99.0,"Telangana");
		
		System.out.println("cid : "+ecd1.getCId()+" CName="+ecd1.getCName()+" cBal : "+ecd1.getCBal()+" Address : "+ecd1.getAddress());
		System.out.println("cid : "+ecd2.getCId()+" CName="+ecd2.getCName()+" cBal : "+ecd2.getCBal()+" Address : "+ecd1.getAddress());
		
	}
}
