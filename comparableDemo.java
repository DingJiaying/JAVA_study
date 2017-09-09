package demo6;
/**
 * 练习使用comparable接口
 * @author ding
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Book implements Comparable <Book> {  //定义BOOK类实现接口，不写的话默认是object类型
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
	@Override
	public int compareTo(Book b) {  //覆写Comparable方法针对book类
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
	public static void main(String[] args) {   //主方法
		List<Book> bookList = new ArrayList<Book>() ;   //实例化集合对象
		bookList.add(new Book("Oracle开发实战", 60));
		bookList.add(new Book("Java开发实战", 69.8));
		bookList.add(new Book("Java Web开发实战", 59.8));
		bookList.add(new Book("Android开发实战", 58));
		Object obj [] = bookList.toArray() ;  //将集合转成了数组，toArray只能用Object接收
		Arrays.sort(obj) ;	// 为对象数组排序
		System.out.println(Arrays.toString(obj));
	}
}
