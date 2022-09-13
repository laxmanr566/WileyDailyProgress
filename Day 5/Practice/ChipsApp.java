
public class ChipsApp {
private static void main(String[] args) {
	String str = "Lays";
	ChipsFactory cf=new ChipsFactory();
	Chips chips=cf.createChips(str);
	if(chips==null) {
		System.out.println("Invalid input");
	}
	System.out.println(chips.getCalories());
	System.out.println(chips.getPrice());
}
}
