package demo3;
/**
 * @descript �����������
 * @author ding
 *
 */
public class Student extends Person {
	/*
	 * ���������Ĺ��췽��
	 */
	public Student (String name, int age, String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	@Override	
	/**
	 * //��д����ķ���
	 */
	public  String talk() {   
		return name+","+age+","+occupation;
	};  

}
