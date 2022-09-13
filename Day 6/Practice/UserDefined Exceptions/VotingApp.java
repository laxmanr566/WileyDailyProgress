import java.util.Scanner;

public class VotingApp {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	try {
		if(n<18) {
			throw new AgeNotEnoughException(" underage to vote");
		}
		else {
			System.out.println("Thank you for the vote");
		}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
