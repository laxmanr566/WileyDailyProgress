
 class Vechile {
	int i=0;
	Vechile(){
		System.out.println("This is Default Vechile constructor");
	}
	
	Vechile(int i){
		this.i=i;
		System.out.println("this is parameterized construtor of Vechile Value of i is ");
	}
	
	public void drive() {
		System.out.println("The Vechile is driving");
	}

	public void stop() {
		System.out.println("The Vechile is STOPED");
	}
	public void printVechile() {
		System.out.println("value of intstance variable i is "+i);
	}
}	
