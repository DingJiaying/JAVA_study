package demo6;
/**
 * �����ڲ������ϰ
 * @author ding
 *
 */
abstract class Bird             //������
{
    private String name;           //��Ա����
    public String getName()          //��ͨ�ĳ�Ա����
    {
        return name;
    }
    public void setName(String name)   
    {
        this.name = name;
    }
    public abstract int fly();          //���󷽷�
}
public class AnonymousInnerClass {         //���������
	public void test(Bird bird)           //��ͨ�ĳ�Ա����
    {
        System.out.println(bird.getName() + "����ܷ� " + bird.fly() + "��");
    }
    public static void main(String[] args)     //������
    {
    	AnonymousInnerClass test = new AnonymousInnerClass();
        test.test(new Bird()
        {
            public int fly()
            {
                return 1000;
            }
            public String getName()
            {
                return "С��";
            }
        });
    }
}
