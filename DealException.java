package demo1;
/**
 * ������ܳ��ֵ��쳣
 * @author ding
 *
 */
public class DealException {
		public static void main(String[] args) {
			try
			// �����������Ĵ���
			{
				int arr[] = new int[5];
				arr[10] = 7; 	// �����������쳣  throw new ArrayIndexOutOfBoundsException(10)
			}
			catch( ArrayIndexOutOfBoundsException e )//�ȼ���ArrayIndexOutOfBoundsException e =new ArrayIndexOutOfBoundsException;
			{
				System.out.println( "���鳬���趨��Χ��" );
				e.printStackTrace();   //��ӡ������Ϣ������λ�ò��ɿ�
			}
			finally
			// �����ĳ������һ����ִ��
			{
				System.out.println( "����һ���ᱻִ�У�" );
			}
			
			System.out.println( "main()����������" );
		}

}
