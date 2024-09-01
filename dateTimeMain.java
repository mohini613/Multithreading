package Multithreadingg;

public class dateTimeMain {

    public static void main(String[] args) {
        dateAndTime dt = new dateAndTime();
        DateTimeMyThread t1 = new DateTimeMyThread(dt, "Ram");
        t1.start();
        DateTimeMyThread t2 = new DateTimeMyThread(dt, "Amol");
        t2.start();
    }
}