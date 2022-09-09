
class TaskKeywords {
	public void TaskKeywords() {
		System.out.println("insider consitructor");
	}
//public static void main(String args[]) {
//	TaskKeywords tk=new TaskKeywords();
//	tk.forDemo(10);
//	tk.doWhileDemo(20);
//	tk.ifElseDemo(9, 6);
//	tk.whileDemo(10, 20);
//	tk.continueBreakDemo(0);
//	tk.TaskKeywords();
//	System.out.println("end of the this code");
//	
//}

public void forDemo(int n) {
	for(int i=0;i<n;i++) {
		System.out.println(i);
	}
}

public void ifElseDemo(int a,int b) {
	System.out.println("\n\n if else demo");
	
	System.out.println(a==b?true:false); 
}

public void whileDemo(int i,int n) {
	System.out.println("printing true until "+i+"<"+n);
	while(i<n) {
		System.out.println("true : "+i+" < "+n);
		i++;
	}
}

public void doWhileDemo(int i) {
	do {
		System.out.println(i);
	}while(i<10);
}

public void continueBreakDemo(int i) {
	System.out.println("Increment n only when i is after 10 iteraions");
	for(;i<20;i++) {
		if(i<10) continue;
		if(i>15) break;
		System.out.println(i);
	}
}
}

