package demo3;
/**
 * 通过反射实例化对象
 * @author ding
 *
 */
class Book {
    private String title ;
    private double price ;
    public void setPrice(double price) {
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    // getter略
    @Override
    public String toString() {
        return "图书名称：" + this.title + "，价格：" + this.price ;
    }
}

public class TestReflection01 {
	public static void main(String args[]) throws Exception {
        Class<?> cls = Class.forName("demo3.Book") ;//通过包名.class文件名字，访问类型是？
        Book book = (Book) cls.newInstance() ;  //通过反射得到的运行时类对象创建对应类对象（构造方法）
        book.setTitle("Java开发实战经典") ;
        book.setPrice(79.8) ;
        System.out.println(book);
    }
}
