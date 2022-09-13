
public enum Bikes {
	
	Unicorn(45),Pulsar(40),Rx100(55),Splender(65);
	int i;
	Bikes(int i){
		this.i=i;
	}
	int milage() {
		return i;
	}
}
