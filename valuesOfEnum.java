package demo3;

enum Color {red, blue, green}; //定义枚举

public class valuesOfEnum {
	public static void main(String[] args) {  //主方法
		
		Color[] AllColor =  Color.values();  //把所有值赋给数组
		for (Color aColor : AllColor) {
			System.out.println(aColor);
		}
	}

}
