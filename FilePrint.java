package demo7;
/**
 * 练习打印流的更新，使用固定的格式
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
        // 由FileWriter实例化，则向文件中输出
        System.out.print("Hello World!" + "\r\n") ;
        System.out.close() ;
    }
}
