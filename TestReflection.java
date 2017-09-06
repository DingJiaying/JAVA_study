package demo2;
/***
 * 练习反射机制，根据对象找到类
 * @author ding
 *
 */
import java.util.Date;
public class TestReflection {
	public static void main(String[] args) throws Exception {
		Date date = new Date();         //实例化对象
        Class<?> cls = date.getClass() ;// 通过Java反射机制得到类的包名
        System.out.println(cls);
        System.out.println(cls.getName());
        System.out.println(cls.getTypeName());
	}
}
