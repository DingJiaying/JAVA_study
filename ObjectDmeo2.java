package demo2;
/**
 * 练习equals方法
 * @author ding
 *
 */
class Person{
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//覆写Object类中的equals方法
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		boolean temp = true;
		Person p1 = this;  //声明对象
		if (o instanceof Person) {
			//判断是否是Person的实例
			Person p2 = (Person) o;  //如果是Person实例则向下转型
		    
		    //带哦用String类中的equals方法
			if(!(p1.name.equals(p2.name) && p1.age == p2.age)) {
				temp = false;
			}
		}
			else {
				temp = false;
			}		
		return temp;
	}	
}


public class ObjectDmeo2 {
	public static void main(String[] args) {
		Person p1 = new Person("张三",23);
		Person p2 = new Person("张三",23);
		
	//判断p1和p2是否相等
		System.out.println(p1.equals(p2)? "同一个人" :"不是同一个人");
	}

}
