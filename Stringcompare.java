package demo2;
/**
 * 比较字符串的大小关系
 * @author ding
 *
 */
public class Stringcompare {
	public static void main(String[] args) {
		String str1="This is a string";                    //直接赋值建立对象str1
	    String str2=new String("this is a string");     //构造法建立对象str2
	    int result=str1.compareTo("That is another string ");    //   result=8   
	    int result1=str1.compareTo("This is a string");        //   result1=0   
	    int result2=str1.compareTo(str2);                  //   result2=-32   
	    System.out.println(result); 
	    System.out.println(result1); 
	    System.out.println(result2); 
	}
}
