package demo1;

class Student extends Person{
		
		String school;
		//子类的构造方法
		Student(String name, int age,String school) {
			super(name, age);     //用super调用父类中的构造方法
			this.school = school;
			System.out.println("进入子类的有参构造方法");
		}
		Student(){
			super();//隐含的一句
			System.out.println("进入子类的无参构造方法");
		}
		
		/**
		 * study方法
		 */
		void study() {
			System.out.println("我在"+school+"读书");
		}
	}

