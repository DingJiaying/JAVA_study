package demo8;
/**
 * 实现打印流的格式化输出
 * @author ding
 *
 */
public class PrintFormat {
	public static void main(String[] args) {        
        /***输出字符串***/
        // %s表示输出字符串，也就是将后面的字符串替换模式中的%s
        System.out.printf("第1个输出 ：%s", new Integer(1212));
        // %n表示换行
        System.out.printf("第2个输出 ：%s%n", "end line");
        // 还可以支持多个参数
        System.out.printf("第3个输出 ：%s = %s%n", "Name", "Zhangsan");
        // %S将字符串以大写形式输出
        System.out.printf("第4个输出 ：%S = %s%n", "Name", "Zhangsan");
        // 支持多个参数时，可以在%s之间插入变量编号，如，1$表示第一个字符串
        System.out.printf("第5个输出 ：%1$s = %3$s %2$s%n", "Name", "san", "Zhang");
       
        /***输出boolean类型***/
        System.out.printf("第6个输出 ：true = %b; false = ", true);
        System.out.printf("第7个输出 ：%b%n", false);

        /***输出整数类型***/
        Integer iObj = 342;
        // %d表示将整数格式化为10进制整数
        System.out.printf("第8个输出 ：%d; %d; %d%n", -50, 234L, iObj);
        // %o表示将整数格式化为8进制整数
        System.out.printf("第9个输出 ：%o; %o; %o%n", -50, 234L, iObj);
        // %x表示将整数格式化为16进制整数
        System.out.printf("第10个输出 ：%x; %x; %x%n", -50, 234L, iObj);
        // %X表示将整数格式化为16进制整数，并且字母变成大写形式
        System.out.printf("第11个输出 ：%X; %X; %X%n", -500, 2343L, iObj);
       
        /***输出浮点类型***/
        Double dObj = 45.6d;
        // %e表示以科学技术法输出浮点数
        System.out.printf("第12个输出 ：%e; %e; %e%n", -56.41f, 7464.232d, dObj);
        // %E表示以科学技术法输出浮点数，并且为大写形式            
        System.out.printf("第13个输出 ：%E; %E; %E%n", -56.41f, 7464.232d, dObj);
        // %f表示以十进制格式化输出浮点数
        System.out.printf("第14个输出 ：%f; %f; %f%n", -75.43f, 7464.232d, dObj);
        // 还可以限制小数点后的位数
        System.out.printf("第15个输出 ：%.1f; %.3f; %f%n", -75.43f, 74.232d, dObj);       
    }
}
