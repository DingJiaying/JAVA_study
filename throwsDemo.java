package demo2;
/**
 * 练习throws的用法
 * @author ding
 *
 */
public class throwsDemo {
	public static void main(String[] args) {
		 int[] arr = new int[5];	        
	        try{
	            setZero( arr, 10 );
	        }catch( ArrayIndexOutOfBoundsException e ){   //完成错误的赋值
	            System.out.println( "数组超出设定范围！" );
	            System.out.println( "异常：" + e ); // 显示异常对象e的内容         
	        }
	        
	        System.out.println( "main()方法结束！" );
	}
	
	private static void setZero( int[] arr, int index )
	        throws ArrayIndexOutOfBoundsException      //观察是否有数组溢出
	    {
	        arr[ index ] = 0;
	    }

}
