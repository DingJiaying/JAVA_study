package demo7;
/**
 * 练习comparator的使用
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
		return "书名：" + this.title + "，价格：" + this.price + "\n" ;
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
class BookComparator implements Comparator<Book> {  //自定义一个类，实现接口
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
				new Book("Oracle开发实战", 60),
				new Book("Java开发实战", 69.8), 
				new Book("Java Web开发实战", 59.8), 
				new Book("Android开发实战", 58)};
			Arrays.sort(book, new BookComparator()); // 比较器对象的实现类为对象数组排序
			System.out.println(Arrays.toString(book));
	}
}
