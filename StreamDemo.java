package demo3;
/**
 * �ֽ������ַ���
 * @author ding
 *
 */
import java.io.InputStream ;
import java.io.OutputStream ;
import java.io.FileInputStream ;
import java.io.FileNotFoundException ;
import java.io.FileOutputStream ;
import java.io.IOException ;
import java.io.File ;

import java.io.* ;
public class StreamDemo {
	public static void main(String args[])
    {
        File f = new File("C:\\eclipse-workplace\\Test For Chapter23\\src\\demo3\\temp.txt") ;
        OutputStream out = null ;
        try
        {
            out = new FileOutputStream(f) ;  //ʵ�������൱������ת��
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace() ;
        }
        // ���ַ���ת���ֽ�����
        byte b[] = "Hello World!!!".getBytes() ;
        try
        {
           
            out.write(b) ; // ��byte����д�뵽�ļ�֮��
        }
        catch (IOException e1)
        {
            e1.printStackTrace() ;
        }
        try
        {
            out.close() ;//�ر��������ڴ��������֮�ʱ�����Ӳ����
        }
        catch (IOException e2)
        {
            e2.printStackTrace() ;
        }
        
        // ����Ϊ���ļ�����
        InputStream in = null ;
        try
        {
            in = new FileInputStream(f) ;
        }
        catch (FileNotFoundException e3)
        {
            e3.printStackTrace() ;
        }
        // ����һ���ռ����ڽ����ļ�������������
        byte b1[] = new byte[1024] ;
        int i = 0 ;
        try
        {
            // ��b1�����ô��ݵ�read()����֮�У�ͬʱ�˷������ض������ݵĸ���
            i = in.read(b1) ;
        }
        catch (IOException e4)
        {
            e4.printStackTrace() ;
        }
        try
        {
            in.close() ;
        }
        catch (IOException e5)
        {
            e5.printStackTrace() ;
        }
        // ��byte����ת��Ϊ�ַ������
        System.out.println(new String(b1, 0, i)) ;
    }
}
