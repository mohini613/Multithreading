package Multithreadingg;

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException{
		  for(int i=1;i<3;i++);{

System.out.println("Main Thread");
{
	MyThreadJoin t= new MyThreadJoin();
	t.start();
  t.join();
  //System.out.println(t);
}
		  }
}
}
