package demo9;
/**
 * ��ϰʹ�úϲ���
 * @author ding
 *
 */
import java.io.* ;

public class SequenceDemo {
	public static void main(String[] args) throws IOException
    {
        // ���������ļ�������
        FileInputStream in1 = null, in2 = null ;  
        // ����һ���ϲ�������
        SequenceInputStream s = null ;
        FileOutputStream out = null ;  //��������һ��д���������ϲ���һ��
        
        try
        {
            // ����������������ļ�
            File inputFile1 = new File("C:\\eclipse-workplace\\Test For Chapter23\\src\\demo9\\1.txt") ;
            File inputFile2 = new File("C:\\eclipse-workplace\\Test For Chapter23\\src\\demo9\\2.txt") ;
            // ����һ������ļ�
            File outputFile = new File("C:\\eclipse-workplace\\Test For Chapter23\\src\\demo9\\12.txt") ;
            
            in1 = new FileInputStream(inputFile1) ;   //ʵ����
            in2 = new FileInputStream(inputFile2) ;
            
            // ��������������Ϊһ��������
            s = new SequenceInputStream(in1, in2) ;
            out = new FileOutputStream(outputFile) ;
            
            int c ;
            while ((c = s.read()) != -1)
                out.write(c) ;   //���ֻ��һ�仰��ѭ���Ĵ����ſ���ʡ��
            
            in1.close() ;
            in2.close() ;
            s.close() ;
            out.close() ;
            System.out.println("ok...") ;
        }
        catch (IOException e)
        {
            e.printStackTrace() ;
        }
        finally
        {
            if (in1 != null)
                try
                {
                    in1.close() ;
                }
                catch (IOException e)
                {
                }
            if (in2 != null)
                try
                {
                    in2.close() ;
                }
                catch (IOException e)
                {
                }
            if (s != null)
                try
                {
                    s.close() ;
                }
                catch (IOException e)
                {
                }
            if (out != null)
                try
                {
                    out.close() ;
                }
                catch (IOException e)
                {
                }
        }
    }
}
