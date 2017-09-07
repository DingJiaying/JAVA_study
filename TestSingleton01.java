package demo2;
/**
 * ��ϰ����ģʽ
 * @author ding
 *
 */
class Singleton {
    private static Singleton instance = new Singleton() ;   // ˽�л�ʵ��������
    private Singleton() {}  // ��ʱ�����в����������޲ε�ʲô�������Ĺ���
    public static Singleton getInstance() {   //ֻ�ṩ�����get����
        return instance ;
    }
    public void print() {                       //��ͨ�ķ���
        System.out.println("Hello World .") ;
    }
}
public class TestSingleton01 {
	public static void main(String[] args) {
		Singleton instance = null ; // ��������
        instance = Singleton.getInstance() ;  //���÷���
        instance.print() ;  //����˽�л�����ķ���
	}

}
