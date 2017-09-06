package demo4;
/**
 * 字符串与字符数组相互转换,变换大小写
 * @author ding
 *
 */
public class StringArray {
	public static void main(String[] args) {
		String str = "hellojava" ;
        char data[]= str.toCharArray() ;  // 将字符串变为字符数组
        for (int x = 0 ; x < data.length ;x ++) 
        {
            System.out.print(data[x] + "、") ;
            data[x] -= 32 ; // 小写变为大写
        }
        System.out.println() ;
        System.out.println("将全部字符数组变为字符串：" + new String(data)) ;
        // 取得部分内容的时候需要设置开始点和取得的长度
        System.out.println("将部分字符数组变为字符串：" + new String(data,5,4)) ;
	}
}
