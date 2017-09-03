package demo3;
/**
 * @descript 抽象类的子类
 * @author ding
 *
 */
public class Student extends Person {
	/*
	 * 三个参数的构造方法
	 */
	public Student (String name, int age, String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	@Override	
	/**
	 * //覆写父类的方法
	 */
	public  String talk() {   
		return name+","+age+","+occupation;
	};  

}
