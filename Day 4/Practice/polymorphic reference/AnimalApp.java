
public class AnimalApp {
	public static void checkobject(Animal a) {
		if(a instanceof Dog ) {
			System.out.println("It is a dog");
			a.talk();
			a.sleep();
			
		}else {
			System.out.println("It is a cat");
			a.talk();
			a.sleep();
			
		}
	}
public static void main(String args[]) {
	Animal a=new Dog();
	Animal b=new Cat();
	checkobject(a);
	checkobject(b);	
	//Dog extends Animal calss so every function in calss ANimal 
	// is also available in Dog


}
}
