package demo1;

class Student extends Person{
		
		String school;
		//����Ĺ��췽��
		Student(String name, int age,String school) {
			super(name, age);     //��super���ø����еĹ��췽��
			this.school = school;
			System.out.println("����������вι��췽��");
		}
		Student(){
			super();//������һ��
			System.out.println("����������޲ι��췽��");
		}
		
		/**
		 * study����
		 */
		void study() {
			System.out.println("����"+school+"����");
		}
	}

