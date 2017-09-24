package demo4;
/**
 * �ܵ�����ʹ��
 * @author ding
 *
 */
import java.io.* ;

public class PipeStreamDemo {
	public static void main(String args[])
    {
        try
        {
            Sender sender = new Sender() ;       // �����̶߳���sender
            Receiver receiver = new Receiver() ; // �����̶߳���receiver
            PipedOutputStream out = sender.getOutputStream() ; // д��
            PipedInputStream in = receiver.getInputStream() ; // ����
            out.connect(in) ; // ��������͵�����
            sender.start() ; // �����߳�
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
        String s = new String("Receiver�����!") ;
        try
        {
            out.write(s.getBytes()) ; // д�루���ͣ�
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
            int len = in.read(buf) ; // ��������
            s = new String(buf, 0, len) ;
            System.out.println("�յ���������Ϣ��" + s) ;
            in.close() ;
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage()) ;
        }
    }
}