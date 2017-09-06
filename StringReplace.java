package demo7;
/**
 * 字符串替换方法
 * @author ding
 *
 */
public class StringReplace {
	public static void main(String[] args) {
		String str = "helloworld" ; // 字符串
        System.out.println(str.replaceAll("o","***"));  //所有子串出现的位置都替换
        System.out.println(str.replaceFirst("l","_"));  //替换第一次出现字符子串
	}
}
