package demo2;
/**
 * ��ϰequals����
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
	
	//��дObject���е�equals����
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		boolean temp = true;
		Person p1 = this;  //��������
		if (o instanceof Person) {
			//�ж��Ƿ���Person��ʵ��
			Person p2 = (Person) o;  //�����Personʵ��������ת��
		    
		    //��Ŷ��String���е�equals����
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
		Person p1 = new Person("����",23);
		Person p2 = new Person("����",23);
		
	//�ж�p1��p2�Ƿ����
		System.out.println(p1.equals(p2)? "ͬһ����" :"����ͬһ����");
	}

}
