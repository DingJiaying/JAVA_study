package demo10;
/**
 * 练习通过迭代方法访问类集
 * @author ding
 *
 */

import java.util.*;

public class IteratorDemo {
	public static void main(String[] args) {
		// 创建一个ArrayList数组
				ArrayList<String> al = new ArrayList<String>();  //实例化对象
				// 加入元素到ArrayList中
				// 加入元素到ArrayList中
				al.add( "Welcome" );
				al.add( "to" );
				al.add( "SEU" );
				
				// 使用iterator显示a1中的内容
				System.out.print( "a1 中原始内容是：" );
				Iterator<String> itr = al.iterator();//迭代器不能被实例化，所以实例化具体的对象
				while( itr.hasNext() )                 //判断是否有下一个自负
				{
					Object element = itr.next();       //获取
					System.out.print( element + " " );
				}
				System.out.println();
				
				//在ListIterator中修改内容
				ListIterator<String> litr = al.listIterator();  //获取列表迭代器对象
				while(litr.hasNext()) {                    //判断
					String element = litr.next();          //获取对象
					//用set方法修改其内容
					litr.set(element + "+");               //修改
				}
				System.out.print("a1被修改之后的内容：");
				itr= al.iterator();
				while (itr.hasNext() ) {
					String element = itr.next();
					System.out.print(element + " ");
				}
				System.out.println();
				
				//下面是将列表中的内容反向输出
				System.out.print("将列表反向输出");
				//hasPreviours由后向前输出
				while(litr.hasPrevious()) {    //获取上一个元素
					Object element = litr.previous();
					System.out.print(element + " ");
				}
				System.out.println();
	}

}
