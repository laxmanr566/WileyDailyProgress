
public class Vechile {
	int i=0;
	Vechile(){
		System.out.println("This is Vechile constructor");
	}
	
	Vechile(int i){
		this();
		this.i=i;
		System.out.println("this is parameterized construtor of Vechile");
	}
	
	public void printVechile() {
		System.out.println("this is the print method of Vechile");
	}
}	
