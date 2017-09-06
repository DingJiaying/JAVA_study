package demo1;
/**
 * 练习克隆的使用
 * @author ding
 *
 */
class Book implements Cloneable // 实现接口克隆，可以被克隆
{ 
    private String title;
    private double price;

    public Book() 
    {
    }

    public Book(String title, double price) 
    {
        this.title = title;
        this.price = price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public double getPrice() 
    {
        return price;
    }

    public String getTitle() 
    {
        return title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException 
    { // 重新定义了一次clone()
        return super.clone();
    }

    @Override
    public String toString() 
    {
        return "Book [title=" + title + ", price=" + price + "]";
    }
}
public class TestCloneDemo {
	public static void main(String[] args) {
		Book bookA = new Book("Java从入门到精通", 79.8);
        /*Book bookB = (Book) bookA.clone(); // 对象克隆
        bookB.setPrice(100.8);
        System.out.println(bookA);  //打印对象的Tostring
        System.out.println(bookB);*/
	}
}
