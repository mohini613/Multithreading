package Multithreadingg;
import java.util.Date;
public class dateAndTime {
public void wish(String name) {
	Date date=new Date();
	System.out.println(date);
	
	synchronized (this) {
		for(int i=0;i<3;i++) {
			System.out.println("good evening:");
				try {
					Thread.sleep(2000);
				}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
				System.out.println(name);
		}
	}
}
	}


