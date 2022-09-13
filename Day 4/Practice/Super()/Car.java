
public class Car extends Vechile {
	Car(int i){
		super(i);
		System.out.println("para constructor of car");
	}
	Car(){
		super();
		System.out.println("default constructor of car");
	}
	@Override
	public void drive() {
		System.out.println("The car is driving");
	}
	@Override
	public void stop() {
		System.out.println("The car has STOPPED");
	}
	
}
