package demo1;
/**
 * File������ʹ��
 * @author ding
 *
 */
import java.io.File ;

public class FileDemo {
	public static void main(String[] args) {
		//File f = new File("C:\\eclipse-workplace\\Test For Chapter23\\src\\demo1\\1.txt") ;                //ʵ����File����
		File f = new File("1.txt") ; //���·�����������Ŀ��˵��
		if (f.exists())    //�ж��ļ���Ŀ¼�Ƿ����
            f.delete() ;   //ɾ��
        else
            try
            {
                f.createNewFile() ;   //����һ�����ļ�
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage()) ;  //��������쳣
            }
        // getName()������ȡ���ļ���
        System.out.println("�ļ�����" + f.getName()) ;
        // getPath()������ȡ���ļ�·��
        System.out.println("�ļ�·����" + f.getPath()) ;
        // getAbsolutePath()�������õ�����·����
        System.out.println("����·����" + f.getAbsolutePath()) ;  //��ȫ������·��
        // getParent()�������õ����ļ�����
        System.out.println("���ļ������ƣ�" + f.getParent()) ;
        // exists()���ж��ļ��Ƿ����
        System.out.println(f.exists() ? "�ļ�����" : "�ļ�������") ;
        // canWrite()���ж��ļ��Ƿ��д
        System.out.println(f.canWrite() ? "�ļ���д" : "�ļ�����д") ;
        // canRead()���ж��ļ��Ƿ�ɶ�
        System.out.println(f.canRead() ? "�ļ��ɶ�" : "�ļ����ɶ�") ;
        // / isDirectory()���ж��Ƿ���Ŀ¼
        System.out.println(f.isDirectory() ? "��" : "����" + "Ŀ¼") ;
        // isFile()���ж��Ƿ����ļ�
        System.out.println(f.isFile() ? "���ļ�" : "�����ļ�") ;
        // isAbsolute()���Ƿ��Ǿ���·������
        System.out.println(f.isAbsolute() ? "�Ǿ���·��" : "���Ǿ���·��") ;
        // lastModified()���ļ������޸�ʱ��
        System.out.println("�ļ�����޸�ʱ�䣺" + f.lastModified()) ;
        // length()���ļ��ĳ���
        System.out.println("�ļ���С��" + f.length() + " Bytes") ;
        File file = new File("C:"+File.separator+"1.txt");  //����ͨ�õķ���д��·��
        System.out.println(file.delete());
}
}
