package demo3;
/**
 * 字节流与字符流
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
            out = new FileOutputStream(f) ;  //实例化，相当于向上转型
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace() ;
        }
        // 将字符串转成字节数组
        byte b[] = "Hello World!!!".getBytes() ;
        try
        {
           
            out.write(b) ; // 将byte数组写入到文件之中
        }
        catch (IOException e1)
        {
            e1.printStackTrace() ;
        }
        try
        {
            out.close() ;//关闭流，将内存里的内容之际保存在硬盘里
        }
        catch (IOException e2)
        {
            e2.printStackTrace() ;
        }
        
        // 以下为读文件操作
        InputStream in = null ;
        try
        {
            in = new FileInputStream(f) ;
        }
        catch (FileNotFoundException e3)
        {
            e3.printStackTrace() ;
        }
        // 开辟一个空间用于接收文件读进来的数据
        byte b1[] = new byte[1024] ;
        int i = 0 ;
        try
        {
            // 将b1的引用传递到read()方法之中，同时此方法返回读入数据的个数
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
        // 将byte数组转换为字符串输出
        System.out.println(new String(b1, 0, i)) ;
    }
}
