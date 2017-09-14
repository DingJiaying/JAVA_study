package demo1;
/**
 * 获得线程的名称
 * @author ding
 *
 */
public class GetNameThreadDemo extends Thread{  //继承Thread类
	public void run()                   //覆写Thread类的run方法
	{
		for( int i = 0; i < 5; ++i )
		{
			printMsg();
			
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

	public void printMsg()
	{
		// 获得运行此代码的线程的引用
		Thread t = Thread.currentThread();   //获取当前线程
		String name = t.getName();       //获取当前线程的名字
		System.out.println( "name = " + name );
	}

	public static void main( String[] args )
	{
		GetNameThreadDemo t1 = new GetNameThreadDemo();//创建实例化线程对象
		t1.start();                                //启动线程
		for( int i = 0; i < 5; ++i )
		{
			t1.printMsg();                       //调用了打印方法
			
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
