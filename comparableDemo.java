package demo6;
/**
 * ��ϰʹ��comparable�ӿ�
 * @author ding
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Book implements Comparable <Book> {  //����BOOK��ʵ�ֽӿڣ���д�Ļ�Ĭ����object����
	private String title ;
	private double price ;
	public Book(String title,double price) {
		this.title = title ;
		this.price = price ;
	}
	@Override
	public String toString() {
		return "������" + this.title + "���۸�" + this.price + "\n" ;
	}
	@Override
	public int compareTo(Book b) {  //��дComparable�������book��
		if (this.price > b.price) {
			return 1 ;
		} else if (this.price < b.price) {
			return -1 ;
		} else {
			return 0;
		}
	}
}

public class comparableDemo {
	public static void main(String[] args) {   //������
		List<Book> bookList = new ArrayList<Book>() ;   //ʵ�������϶���
		bookList.add(new Book("Oracle����ʵս", 60));
		bookList.add(new Book("Java����ʵս", 69.8));
		bookList.add(new Book("Java Web����ʵս", 59.8));
		bookList.add(new Book("Android����ʵս", 58));
		Object obj [] = bookList.toArray() ;  //������ת�������飬toArrayֻ����Object����
		Arrays.sort(obj) ;	// Ϊ������������
		System.out.println(Arrays.toString(obj));
	}
}
