package demo3;
/**
 * ͨ������ʵ��������
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
    // getter��
    @Override
    public String toString() {
        return "ͼ�����ƣ�" + this.title + "���۸�" + this.price ;
    }
}

public class TestReflection01 {
	public static void main(String args[]) throws Exception {
        Class<?> cls = Class.forName("demo3.Book") ;//ͨ������.class�ļ����֣����������ǣ�
        Book book = (Book) cls.newInstance() ;  //ͨ������õ�������ʱ����󴴽���Ӧ����󣨹��췽����
        book.setTitle("Java����ʵս����") ;
        book.setPrice(79.8) ;
        System.out.println(book);
    }
}
