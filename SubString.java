package demo8;
/**
 * 取子串的方法重载
 * @author ding
 *
 */
public class SubString {
	public static void main(String[] args) {
		String str = "HelloJava!!!" ; // 字符串
        System.out.println(str.substring(5)) ;//截取从指定位置到性部的子串
        System.out.println(str.substring(0,5)) ;//截取从指定位置到结束位置的子串
	}
}
