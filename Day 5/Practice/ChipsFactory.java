
public class ChipsFactory {

	public Chips createChips(String str) {
		System.out.println("Inside of create chips");
		if(str == null){
			return null;
		}
		switch(str.toLowerCase()) {
		case "bingo":
			return new Bingo(); 
		case "lays":
			return new Lays();
		case "unclechips":
			return new UncleChips();
		default :
			return null;
		}
			
	}
}
