package demo6;
/**
 * �̳�Thread��ʵ�ֶ��߳�
 * @author ding
 *
 */
public class ThreadDemo {
	public static void main(String[] args) {
		new TestThread().start();//����һ���߳̿�CPU����˭����
		//ѭ�����
		for(int i = 0; i<5; ++i) {
			System.out.println("main �߳�������");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
 class TestThread extends Thread {//����Thread����
	public void run() {               //��дThread���run����
		for(int i = 0; i<5; ++i) {
			System.out.println("TestThread ������");
			try {
				Thread.sleep(1000);   //˯��1��
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}