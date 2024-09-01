package Multithreadingg;

public class MainthreadPriority {

	public static void main(String[] args) {
System.out.println("Main Thread priority=" +Thread.currentThread().getPriority());

Thread.currentThread().setPriority(6);
System.out.println(Thread.currentThread().getPriority());

myThreadd t=new myThreadd();

System.out.println(Thread.currentThread().getName());//currentThread() using means it will give current thread executed thread refrence
System.out.println(t.getName());
t.setPriority(10);
t.start();
System.out.println(t.getPriority());
for (int i=0; i<3;i++);{
	System.out.println("Main Thread");
}
/*for (int i=0; i<3;i++);{
		
	}
	myThreadd t=new myThreadd();
	t.setPriority(10);//assume this is line no.19q
	t.start();
	//System.out.println(t);
	}
*/
}
}
