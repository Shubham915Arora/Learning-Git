//qwerty vfv

package threads;
import java.lang.Thread;
import java.util.Random;
class thread extends Thread
{
	public static int a;
	Random rand = new Random();
	public void run()
	{
		for(int j=0;j<10;j++)
		{
		a = rand.nextInt(10);
		System.out.println(a);
			
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}
} 

class thread1 extends Thread
{
	
	public void run()
	{
		if(thread.a%2==0)
		{
			
			System.out.println(thread.a*thread.a);
			
		}
	}
}
class thread2 extends Thread
{
	public void run()
	{
		if(thread.a%2!=0)
		{
			
			System.out.println(thread.a*thread.a*thread.a);
			
		}
	}	
}

public class MultiThreads {
	public static void main(String[] args) {
		thread t1 = new thread();
		thread1 t2 = new thread1();
		thread2 t3 = new thread2();
		t1.start();
		t2.start();
		t3.start();
 ƒ}
}