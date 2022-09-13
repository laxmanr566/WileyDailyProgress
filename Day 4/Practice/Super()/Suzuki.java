
 class Suzuki extends Car{
	Suzuki(){
		System.out.println("In default constructor of suzuki");
	}
	Suzuki(int i){
		super(i);
		System.out.println("In para COnstructor of Suzuki");
	}
	@Override
	public void drive() {
		System.out.println("Suzuki is driving");
	}
	public void stop() {
		System.out.println( "Suzuki is STOPPED");
	}

	
}
