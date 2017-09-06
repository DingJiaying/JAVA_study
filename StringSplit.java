package demo9;
/**
 * 字符串拆分方法，返回拆分之后的数组
 * @author ding
 *
 */
public class StringSplit {
	public static void main(String[] args) {
		String str = "hello world hello java" ; // 字符串
        String data[] = str.split(" ") ;   // 按照空格拆分
        for (int i = 0 ; i < data.length ; i ++) 
        {
            System.out.println(data[i]) ;
        }
        System.out.println("-----------");
        String data1[] = str.split(" " , 3) ;   // 按照空格拆分
        for (int i = 0 ; i < data1.length ; i ++) 
        {
            System.out.println(data1[i]) ;
        }
	}
}
