package demo7;
/**
 * ��ϰ��ӡ���ĸ��£�ʹ�ù̶��ĸ�ʽ
 * @author ding
 *
 */
import java.io.* ;

public class FilePrint {
	public static void main(String args[])
    {
        PrintWriter out = null ;
        File f = new File("c:\\temp.txt") ;
        try
        {
            out = new PrintWriter(new FileWriter(f)) ;
        }
        catch (IOException e)
        {
            e.printStackTrace() ;
        }
        // ��FileWriterʵ�����������ļ������
        System.out.print("Hello World!" + "\r\n") ;
        System.out.close() ;
    }
}
