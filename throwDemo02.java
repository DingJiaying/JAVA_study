package demo3;
/**
 * �쳣����ı�׼��ʽ
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
            System.out.println( "�쳣��" + e ); // ��ʾ�쳣����e�����ݮ�         
        }
        
        System.out.println( "main()����������" );
	}
	
	private static void setZero( int[] arr, int index )
            throws ArrayIndexOutOfBoundsException{       //��һ��
	System.out.println( "-------����setZero��ʼ-------" );
	
	try{
	arr[index] = 0;
	}catch( ArrayIndexOutOfBoundsException ex ){
	throw ex;                                         //�ڶ���
	}
	finally{
	System.out.println( "-------����setZero����-------" );
	}
	}     
}
