package demo15;
/**
 * ��ϰCollections��ʹ��
 * @author ding
 *
 */
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	public static void main(String[] args) {
		double array[] = {110.12,28.55,56.89,345};     //�������鲢��ֵ
		ArrayList<Double>  list = new ArrayList<Double>();//ʵ�������϶���
		
		for (int i = 0; i < array.length; i++) 
		{
			list.add(new Double(array[i]));
		}
		Collections.sort(list);
		System.out.println("----���������-----");	
		for (int i = 0; i < array.length; i++) 
		{
		  System.out.println(list.get(i));	
	    }
		System.out.println("----���鷴ת��-----");	
		Collections.reverse(list);
		for (int i = 0; i < array.length; i++) 
		{
		  System.out.println(list.get(i));	
	    }
	}
}
