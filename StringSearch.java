package demo6;
/**
 * 字符串查找方法
 * @author ding
 *
 */
public class StringSearch {
	public static void main(String[] args) {
		String str = "**hello$$world##" ; // 字符串
        if (str.contains("hello"))     {    // 查找hello是否存在
            System.out.println("内容存在，已查找到！") ;
        }
        if (str.indexOf("l") != -1)    {   // 查找hello是否存在
            System.out.println("内容存在，字符串位置：" + str.indexOf("l")) ;
        }
        if (str.indexOf("o",6) != -1)        { // 由指定位置开始查找
            System.out.println("内容存在，字符串位置：" + str.indexOf("o",6)) ;
        }
        if (str.lastIndexOf("w",12) != -1)   { // 由指定位置从后向前开始查找，反向
            System.out.println("内容存在，字符串位置：" + str.lastIndexOf("w",12)) ;
        }
        System.out.println(str.startsWith("**")) ;
        System.out.println(str.startsWith("$$",7)) ;
        System.out.println(str.endsWith("##")) ;
	}
}
