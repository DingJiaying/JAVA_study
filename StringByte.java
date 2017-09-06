package demo5;
/**
 * 字符串与字节相互转换
 * @author ding
 *
 */
public class StringByte {
	public static void main(String[] args) {
		String str = "hellojava" ;      // 直接赋值法建立字符串
        byte data[]  = str.getBytes() ; // 解码将字符串变为byte字节数组
        for (int x = 0 ; x < data.length ; x ++)
        {
            data[x] -= 32 ;
        }
        System.out.println(new String(data)) ;//将全部的byte数组变为字符串
        System.out.println(new String(data,5,4)) ;//将部分的byte数组变为字符串
	}
}
