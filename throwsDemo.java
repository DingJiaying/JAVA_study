package demo2;
/**
 * ��ϰthrows���÷�
 * @author ding
 *
 */
public class throwsDemo {
	public static void main(String[] args) {
		 int[] arr = new int[5];	        
	        try{
	            setZero( arr, 10 );
	        }catch( ArrayIndexOutOfBoundsException e ){   //��ɴ���ĸ�ֵ
	            System.out.println( "���鳬���趨��Χ��" );
	            System.out.println( "�쳣��" + e ); // ��ʾ�쳣����e�����ݮ�         
	        }
	        
	        System.out.println( "main()����������" );
	}
	
	private static void setZero( int[] arr, int index )
	        throws ArrayIndexOutOfBoundsException      //�۲��Ƿ����������
	    {
	        arr[ index ] = 0;
	    }

}
