package Multithreadingg;
public class MainMultiTh {
    public static void main(String[] args) {
        MultiTh t = new MultiTh();
        t.start(); // create new thread
        
        for (int i = 0; i <= 5; i++) {
            System.out.println("main thread");
        }
    }
}
