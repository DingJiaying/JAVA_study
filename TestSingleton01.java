package demo2;
/**
 * 练习单例模式
 * @author ding
 *
 */
class Singleton {
    private static Singleton instance = new Singleton() ;   // 私有化实例化对象
    private Singleton() {}  // 此时的类中不会再生成无参的什么都不做的构造
    public static Singleton getInstance() {   //只提供对外的get方法
        return instance ;
    }
    public void print() {                       //普通的方法
        System.out.println("Hello World .") ;
    }
}
public class TestSingleton01 {
	public static void main(String[] args) {
		Singleton instance = null ; // 声明对象
        instance = Singleton.getInstance() ;  //调用方法
        instance.print() ;  //调用私有化对象的方法
	}

}
