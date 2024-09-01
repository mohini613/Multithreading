
package Multithreadingg;

public class DateTimeMyThread extends Thread {
    dateAndTime dt;
    String name;

    DateTimeMyThread(dateAndTime dt, String name) {
        this.dt = dt;
        this.name = name;
    }

    @Override
    public void run() {
        dt.wish(name);
    }
}
