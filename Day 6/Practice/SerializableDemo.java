import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	 int id;
	String name;
	Emp(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println("Inside Emp");
	}
}
public class SerializableDemo  {
	public static void main(String[] args) {
		try {
//			ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("D:\\demo.txt"));
//			Emp e=new Emp(33,"Laxman");
//			obj.writeObject(e);
//			obj.close();
			ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("D:\\demo.txt"));
			Emp e1=(Emp) obj1.readObject();
			e1.display();
			System.out.println(e1.name);
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
	}
}
	
}
