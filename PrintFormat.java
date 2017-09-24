package demo8;
/**
 * ʵ�ִ�ӡ���ĸ�ʽ�����
 * @author ding
 *
 */
public class PrintFormat {
	public static void main(String[] args) {        
        /***����ַ���***/
        // %s��ʾ����ַ�����Ҳ���ǽ�������ַ����滻ģʽ�е�%s
        System.out.printf("��1����� ��%s", new Integer(1212));
        // %n��ʾ����
        System.out.printf("��2����� ��%s%n", "end line");
        // ������֧�ֶ������
        System.out.printf("��3����� ��%s = %s%n", "Name", "Zhangsan");
        // %S���ַ����Դ�д��ʽ���
        System.out.printf("��4����� ��%S = %s%n", "Name", "Zhangsan");
        // ֧�ֶ������ʱ��������%s֮����������ţ��磬1$��ʾ��һ���ַ���
        System.out.printf("��5����� ��%1$s = %3$s %2$s%n", "Name", "san", "Zhang");
       
        /***���boolean����***/
        System.out.printf("��6����� ��true = %b; false = ", true);
        System.out.printf("��7����� ��%b%n", false);

        /***�����������***/
        Integer iObj = 342;
        // %d��ʾ��������ʽ��Ϊ10��������
        System.out.printf("��8����� ��%d; %d; %d%n", -50, 234L, iObj);
        // %o��ʾ��������ʽ��Ϊ8��������
        System.out.printf("��9����� ��%o; %o; %o%n", -50, 234L, iObj);
        // %x��ʾ��������ʽ��Ϊ16��������
        System.out.printf("��10����� ��%x; %x; %x%n", -50, 234L, iObj);
        // %X��ʾ��������ʽ��Ϊ16����������������ĸ��ɴ�д��ʽ
        System.out.printf("��11����� ��%X; %X; %X%n", -500, 2343L, iObj);
       
        /***�����������***/
        Double dObj = 45.6d;
        // %e��ʾ�Կ�ѧ���������������
        System.out.printf("��12����� ��%e; %e; %e%n", -56.41f, 7464.232d, dObj);
        // %E��ʾ�Կ�ѧ���������������������Ϊ��д��ʽ            
        System.out.printf("��13����� ��%E; %E; %E%n", -56.41f, 7464.232d, dObj);
        // %f��ʾ��ʮ���Ƹ�ʽ�����������
        System.out.printf("��14����� ��%f; %f; %f%n", -75.43f, 7464.232d, dObj);
        // ����������С������λ��
        System.out.printf("��15����� ��%.1f; %.3f; %f%n", -75.43f, 74.232d, dObj);       
    }
}
