package demo6;
/**
 * 继承Thread类实现多线程
 * @author ding
 *
 */
public class ThreadDemo {
	public static void main(String[] args) {
		new TestThread().start();//激活一个线程看CPU允许谁运行
		//循环输出
		for(int i = 0; i<5; ++i) {
			System.out.println("main 线程在运行");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
 class TestThread extends Thread {//定义Thread子类
	public void run() {               //覆写Thread类的run方法
		for(int i = 0; i<5; ++i) {
			System.out.println("TestThread 在运行");
			try {
				Thread.sleep(1000);   //睡眠1秒
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}