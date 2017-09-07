package demo3;
/**
 * 异常处理的标准格式
 * @author ding
 *
 */
public class throwDemo02 {
	public static void main(String[] args) {
		int[] arr = new int[5];
        try{
            setZero( arr, 10 );
        }
        catch( ArrayIndexOutOfBoundsException e ){
            System.out.println( "异常：" + e ); // 显示异常对象e的内容         
        }
        
        System.out.println( "main()方法结束！" );
	}
	
	private static void setZero( int[] arr, int index )
            throws ArrayIndexOutOfBoundsException{       //第一步
	System.out.println( "-------方法setZero开始-------" );
	
	try{
	arr[index] = 0;
	}catch( ArrayIndexOutOfBoundsException ex ){
	throw ex;                                         //第二步
	}
	finally{
	System.out.println( "-------方法setZero结束-------" );
	}
	}     
}
