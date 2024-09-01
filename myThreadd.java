package Multithreadingg;

public class myThreadd extends Thread{//we are considering this class as child class


@Override 
public void run()//run method from runable INTERFACE
{
	for(int i=0;i<3;i++);
	{
	System.out.println("Child Thread");	
	}
}
	
}
