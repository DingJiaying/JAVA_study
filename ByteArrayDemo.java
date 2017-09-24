package demo5;
/**
 * ��ϰ�ڴ��������ʹ�ã�������ʱ�ļ�
 * @author ding
 *
 */
import java.io.*;

public class ByteArrayDemo {
	public static void main( String[] args ) throws Exception
	{
		String tmp = "abcdefghijklmnopqrstuvwxyz";
		byte[] src = tmp.getBytes(); // srcΪת��ǰ���ڴ��
		ByteArrayInputStream input = new ByteArrayInputStream( src );
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		new ByteArrayDemo().transform( input, output );
		byte[] result = output.toByteArray(); // resultΪת������ڴ��
		System.out.println( new String( result ) );
	}

	public void transform( InputStream in, OutputStream out )
	{
		int c = 0;
		try
		{
			while( ( c = in.read() ) != -1 ) // read�ڶ������Ľ�β������-1
			{
				int C = (int) Character.toUpperCase( (char) c );
				out.write( C );
			}
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}
