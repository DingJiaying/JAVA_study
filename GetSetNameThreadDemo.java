package demo2;
/**
 * ����߳����ֵĵڶ��ַ���
 * @author ding
 *
 */
public class GetSetNameThreadDemo implements Runnable{                //����Runnable�ӿڵ�ʵ����
	public void run()                                                 //��дRunnable��run����
    {
        Thread temp = Thread.currentThread();                         //��ȡִ�����������߳�ʵ��
        System.out.println("ִ�����������߳�����:" + temp.getName());//��ȡ�̵߳�����
    }
    public static void main(String[] args)
    {
        Thread t = new Thread(new GetSetNameThreadDemo());            //ʵ�����̶߳���
        t.setName("�߳�_����22-demo2");                               //�����̵߳�����
        t.start();                                                    //�����߳�
    }
}
