package demo3;

public class Test {
	/**
	 * @description 抽象类的使用
	 * @param args
	 */
	public static void main(String[] args) {
		Student stu = new Student("小明", 10, "学生");//实例化
		System.out.println(stu.talk());        //调用方法并打印
		
		Worker worker = new Worker("张三", 30, "工人");  //实例化
		System.out.println(worker.talk());     //调用方法并打印
		}
}
