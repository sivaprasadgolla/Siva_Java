package Threads;

public class LambdaThread 
{

	public static void main(String[] args) 
	{
Runnable r1=new Runnable()
{
	
	@Override
	public void run() {
System.out.println("i am runnable...");		
	}
};

Thread t1=new Thread(r1);
t1.start();
Runnable r2=()->{      System.out.println("Thread2 is running..."); }; 
Thread t2=new Thread(r2);
t2.start();
	}

}
