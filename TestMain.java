package demo12;
/**
 * ��ϰ��static����������
 * @author ding
 *
 */
public class TestMain {
	/*
     * public����ʾ�������� 
     * static����ʾ�˷���Ϊһ��̬����������������ֱ�ӵ���
     * void����ʾ�˷����޷���ֵ main��ϵͳ����ķ�������
     * String args[]����������ʱ����
     */
    public static void main(String[] args)
    {
        // ȡ����������ĳ���
        int j = args.length;
        if (j != 2)
        {
            System.out.println("������������д���");
            // �˳�����
            System.exit(1);
        }
        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
    }
}
