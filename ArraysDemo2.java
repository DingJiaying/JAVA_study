package demo5;
/**
 * ��ϰʹ��ArraysDemo2�������������Ͳ���
 * @author ding
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo2 {
	public static void main(String[] args) {
		int arrInt[] = {17,40,12,6,15,16,8,10,18,50};
        //������������arrInt
        Arrays.sort(arrInt); 
        //����ɨ����
        Scanner scan = new Scanner(System.in);
        System.out.println("��������Ҫ���ҵ�������");
        //��ȡ����������������ȴ��������ݲ��س����س�֮�����ɨ��
        int search=scan.nextInt();//ɨ���ַ���
       
       //�������������
        for (int i = 0;i < arrInt.length ;i++ ) {
            System.out.print(arrInt[i]+"  ");
        }
        System.out.println();
        
        //���ö��ֲ��ҷ���ֻ�ܲ�����������飩����ָ��������
        int seaInt = Arrays.binarySearch(arrInt,search);
        if (seaInt >= 0){
            System.out.println(search + "������ĵ�" + (seaInt+1) + "λԪ��");
        }else{
            System.out.println(search + "���������Ԫ��");
        }        
        scan.close(); //�ر�������
	}
}
