package Multithreadingg;

public class DaemonMain {

	public static void main(String[] args) {
		MyThreadJoin t=new MyThreadJoin();
		System.out.println(t.isDaemon());
		System.out.println("after chnaging nature of thread");
		
		t.setDaemon(true);
		t.start();
		System.out.println(t.isDaemon());
}

}
