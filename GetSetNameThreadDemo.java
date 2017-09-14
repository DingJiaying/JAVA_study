package demo2;
/**
 * 获得线程名字的第二种方法
 * @author ding
 *
 */
public class GetSetNameThreadDemo implements Runnable{                //定义Runnable接口的实现类
	public void run()                                                 //覆写Runnable的run方法
    {
        Thread temp = Thread.currentThread();                         //获取执行这条语句的线程实例
        System.out.println("执行这条语句的线程名字:" + temp.getName());//获取线程的名字
    }
    public static void main(String[] args)
    {
        Thread t = new Thread(new GetSetNameThreadDemo());            //实例化线程对象
        t.setName("线程_范例22-demo2");                               //设置线程的名字
        t.start();                                                    //启动线程
    }
}
