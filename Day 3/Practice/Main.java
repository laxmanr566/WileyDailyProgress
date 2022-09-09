

public class Main {
	
public static void main(String args[]) {
	
DefaultConstructorDemo dcd0=new DefaultConstructorDemo();
DefaultConstructorDemo dcd1=new DefaultConstructorDemo();
ParaConst pc=new ParaConst(111,"Ramancha");

dcd1.empid=100;
dcd1.empAddress="Hyderanad";
dcd1.empName="Laxman Ramancha";


System.out.println("Constructors with no value intitalized:"+dcd0);
System.out.println("Constructors with value intitalized via accessing variable directly :"+dcd1);
System.out.println("Parameterized Constructor = "+pc);
}

}
