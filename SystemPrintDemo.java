package demo6;
/**
 * ��ϰ��ӡ����ʹ��
 * @author ding
 *
 */

import java.io.* ;

public class SystemPrintDemo {
	public static void main(String args[])
    {
        PrintWriter out = null ;
        // ͨ��System.out��PrintWriterʵ����
        out = new PrintWriter(System.out) ;
        // ����Ļ�����
        out.print("Hello World!") ;
        out.close() ;
    }
}
