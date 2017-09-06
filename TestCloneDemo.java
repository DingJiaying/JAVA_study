package demo1;
/**
 * ��ϰ��¡��ʹ��
 * @author ding
 *
 */
class Book implements Cloneable // ʵ�ֽӿڿ�¡�����Ա���¡
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
    { // ���¶�����һ��clone()
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
		Book bookA = new Book("Java�����ŵ���ͨ", 79.8);
        /*Book bookB = (Book) bookA.clone(); // �����¡
        bookB.setPrice(100.8);
        System.out.println(bookA);  //��ӡ�����Tostring
        System.out.println(bookB);*/
	}
}
