package demo5;
/**
 * 练习进程的联合
 * @author ding
 *
 */
public class ThreadJoin {
	public static void main( String[] args )
	{
		ThreadTest t = new ThreadTest();
		Thread pp = new Thread( t );
		pp.start();
		int i = 0;
		for( int x = 0; x < 10; ++x )
		{
			if( i == 5 )
			{
				try
				{
					pp.join();       // 强制运行完pp线程后，再运行后面的程序
				}
				catch( Exception e ) // 会抛出InterruptedException
				{
					System.out.println( e.getMessage() );
				}
			}
			System.out.println( "main Thread " + i );
			i += 1;
		}
	}
}
class ThreadTest implements Runnable
{
	public void run()
	{
		int i = 0;
		for( int x = 0; x < 10; ++x )
		{
			try
			{
				Thread.sleep( 1000 );
			}
			catch( InterruptedException e )
			{
				e.printStackTrace();
			}
			System.out.println( Thread.currentThread().getName() + " ---->> " + i );
			i += 1;
		}
	}
}
