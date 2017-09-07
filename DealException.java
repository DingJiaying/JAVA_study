package demo1;
/**
 * 捕获可能出现的异常
 * @author ding
 *
 */
public class DealException {
		public static void main(String[] args) {
			try
			// 检查这个程序块的代码
			{
				int arr[] = new int[5];
				arr[10] = 7; 	// 在这里会出现异常  throw new ArrayIndexOutOfBoundsException(10)
			}
			catch( ArrayIndexOutOfBoundsException e )//等价于ArrayIndexOutOfBoundsException e =new ArrayIndexOutOfBoundsException;
			{
				System.out.println( "数组超出设定范围！" );
				e.printStackTrace();   //打印错误信息，但是位置不可控
			}
			finally
			// 这个块的程序代码一定会执行
			{
				System.out.println( "这里一定会被执行！" );
			}
			
			System.out.println( "main()方法结束！" );
		}

}
