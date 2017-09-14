package demo2;
/**
 * 练习获得线程的名字
 * @author ding
 *
 */
public class GetNameThreadDemo extends Thread{  //定义Thread的子类
	public void run()                           //覆写Thread的run方法
	{
		for( int i = 0; i < 5; ++i )
		{
			printMsg();
			
			try
			{
				Thread.sleep(1000);		         // 当前线程睡眠1秒
			}
			catch( InterruptedException e )
			{
				e.printStackTrace();
			}
		}
	}

	public void printMsg()
	{
		
		Thread t = Thread.currentThread();          // 获得运行此代码的线程的引用
		String name = t.getName();                  //获取线程的名字
		System.out.println( "name = " + name );
	}

	public static void main( String[] args )
	{
		GetNameThreadDemo t1 = new GetNameThreadDemo();   //实例化线程对象
		t1.start();                                      //启动线程，运行run方法
		for( int i = 0; i < 5; ++i )
		{
			t1.printMsg();                               //
			
			try
			{
				Thread.sleep(1000);		// 睡眠1秒
			}
			catch( InterruptedException e )
			{
				e.printStackTrace();
			}
		}
	}
}
