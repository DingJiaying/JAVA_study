package demo9;
/**
 * 练习使用合并流
 * @author ding
 *
 */
import java.io.* ;

public class SequenceDemo {
	public static void main(String[] args) throws IOException
    {
        // 声明两个文件读入流
        FileInputStream in1 = null, in2 = null ;  
        // 声明一个合并序列流
        SequenceInputStream s = null ;
        FileOutputStream out = null ;  //两个读，一个写将两个读合并在一起
        
        try
        {
            // 构造两个被读入的文件
            File inputFile1 = new File("C:\\eclipse-workplace\\Test For Chapter23\\src\\demo9\\1.txt") ;
            File inputFile2 = new File("C:\\eclipse-workplace\\Test For Chapter23\\src\\demo9\\2.txt") ;
            // 构造一个输出文件
            File outputFile = new File("C:\\eclipse-workplace\\Test For Chapter23\\src\\demo9\\12.txt") ;
            
            in1 = new FileInputStream(inputFile1) ;   //实例化
            in2 = new FileInputStream(inputFile2) ;
            
            // 将两个输入流合为一个输入流
            s = new SequenceInputStream(in1, in2) ;
            out = new FileOutputStream(outputFile) ;
            
            int c ;
            while ((c = s.read()) != -1)
                out.write(c) ;   //如果只有一句话，循环的大括号可以省略
            
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
