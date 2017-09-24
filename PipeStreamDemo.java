package demo4;
/**
 * 管道流的使用
 * @author ding
 *
 */
import java.io.* ;

public class PipeStreamDemo {
	public static void main(String args[])
    {
        try
        {
            Sender sender = new Sender() ;       // 创建线程对象sender
            Receiver receiver = new Receiver() ; // 创建线程对象receiver
            PipedOutputStream out = sender.getOutputStream() ; // 写入
            PipedInputStream in = receiver.getInputStream() ; // 读出
            out.connect(in) ; // 将输出发送到输入
            sender.start() ; // 启动线程
            receiver.start() ;
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage()) ;
        }
    }
}
class Sender extends Thread
{
    private PipedOutputStream out = new PipedOutputStream() ;
    
    public PipedOutputStream getOutputStream()
    {
        return out ;
    }
    
    public void run()
    {
        String s = new String("Receiver，你好!") ;
        try
        {
            out.write(s.getBytes()) ; // 写入（发送）
            out.close() ;
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage()) ;
        }
    }
}

class Receiver extends Thread
{
    private PipedInputStream in = new PipedInputStream() ;
    
    public PipedInputStream getInputStream()
    {
        return in ;
    }
    
    public void run()
    {
        String s = null ;
        byte[] buf = new byte[1024] ;
        try
        {
            int len = in.read(buf) ; // 读出数据
            s = new String(buf, 0, len) ;
            System.out.println("收到了以下信息：" + s) ;
            in.close() ;
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage()) ;
        }
    }
}