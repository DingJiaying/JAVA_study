package demo1;
/**
 * String 三种创建方法
 * @author ding
 *
 */
public class Stringnew {
	public static void main(String[] args) {
		String str1 = "Hello" ; // 直接赋值
	      String str2 = new String("Hello") ; // 构造方法赋值
	      String str3 = str2 ;    // 引用传递,传递的是地址
	      System.out.println(str1 == str2) ;  // ==比较地址false
	      System.out.println(str1 == str3) ;  // ==比较地址false
	      System.out.println(str2 == str3) ;  // ==比较地址true
	      System.out.println(str1.equals(str2)) ; // equals比较内容true
	      System.out.println(str1.equals(str3)) ; // equals比较内容true
	      System.out.println(str2.equals(str3)) ; // equals比较内容true
	}
}
