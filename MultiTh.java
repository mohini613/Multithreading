package Multithreadingg;
public class MultiTh extends Thread {
	  
	@Override
    public void run() {
        for(int x = 0; x <= 5; x++) {
            System.out.println("child thread");
        }
    }
}
