package demo7;
/**
 * ��ϰcomparator��ʹ��
 * @author ding
 *
 */
import java.util.Arrays;
import java.util.Comparator;

class Book {
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
	public void setPrice(double price) {
		this.price = price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public String getTitle() {
		return title;
	}
}
class BookComparator implements Comparator<Book> {  //�Զ���һ���࣬ʵ�ֽӿ�
	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getPrice() > o2.getPrice()) {
			return 1 ;
		} else if (o1.getPrice() < o2.getPrice()) {
			return -1 ;
		} 
		return 0;
	}
}

public class comparatorDemo1 {
	public static void main(String[] args) {
		Book book [] = new Book[] {
				new Book("Oracle����ʵս", 60),
				new Book("Java����ʵս", 69.8), 
				new Book("Java Web����ʵս", 59.8), 
				new Book("Android����ʵս", 58)};
			Arrays.sort(book, new BookComparator()); // �Ƚ��������ʵ����Ϊ������������
			System.out.println(Arrays.toString(book));
	}
}
