package demo1;
/**
 * ��ϰ��ʾ�̵߳�����״̬
 * @author ding
 *
 */
import java.util.Scanner;

public class ThreadStatus implements Runnable{      //ʵ��Runnable�ӿ�
	public void run()                               //��дrun����
    {
        System.out.println("��������״̬!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("�ȴ�I/O, ��������״̬!");
        System.out.println("�������ַ�����"); 
        scanner.next();  //���������ַ���
        scanner.close();
        System.out.println("��������״̬,���½������״̬,Ȼ������״̬!");
        try 
        {
            Thread.sleep(1000);                      //�߳���ͣ1000����
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("�߳̽�������״̬!");       
    }
    public static void main(String[] args)
    {
        Thread thread = new Thread(new ThreadStatus());  //����������
        System.out.println("���ڴ���״̬!");
        thread.start();
        System.out.println("���ھ���״̬!");
    }
}
