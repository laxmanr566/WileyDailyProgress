
public class Date {
int dd,mm,yy;
	Date(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public void displayDate() {
		System.out.println(dd+","+mm+","+yy);
	}
	public void checkDate() {
		if(yy>0 && yy<=2099) {
		if(mm==1 || mm==3 || mm==5 || mm==7 || mm==10 || mm==12) {
			if(dd>0 && dd<=31) {
				System.out.println("Valid Date");
			}
			else {
				System.out.println("Invalid Date");
			}
		}else if(mm==4 ||mm==6 ||mm==8 ||mm==9 ||mm==11) {
			if(dd>0 && dd<=30) {
				System.out.println("Valid Date");
			}
			else {
				System.out.println("Invalid Date");
			}
		}else if(mm==2) {
			if(yy%4==0 || yy%200==0) {
				if(dd>0 && dd<=29) {
					System.out.println("Valid Date");
				}
				else {
					System.out.println("Invalid Date");
				}
			}
			else{
				if(dd>0 && dd<=28) {
				System.out.println("Valid Date");
			}
			else {
				System.out.println("Invalid Date");
			}
			}
		}
		}
		else{
			System.out.println("Invalid date");
		}
	}
}
