

public class DefaultConstructorDemo {
int empid;
String empName;
String empAddress;
DefaultConstructorDemo(){
}

@Override
public String toString() {
	return "empid=" + empid + ", empName=" + empName + ", empAddress=" + empAddress ;
}

}
