package demo3;

enum Color {red, blue, green}; //����ö��

public class valuesOfEnum {
	public static void main(String[] args) {  //������
		
		Color[] AllColor =  Color.values();  //������ֵ��������
		for (Color aColor : AllColor) {
			System.out.println(aColor);
		}
	}

}
