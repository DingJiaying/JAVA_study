package demo5;
/**
 * 练习使用ArraysDemo2进行数组的排序和查找
 * @author ding
 *
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo2 {
	public static void main(String[] args) {
		int arrInt[] = {17,40,12,6,15,16,8,10,18,50};
        //升序排序数组arrInt
        Arrays.sort(arrInt); 
        //定义扫描器
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要查找的整数：");
        //获取输入的整数，阻塞等待输入内容并回车，回车之后才能扫描
        int search=scan.nextInt();//扫描字符串
       
       //输出排序后的数组
        for (int i = 0;i < arrInt.length ;i++ ) {
            System.out.print(arrInt[i]+"  ");
        }
        System.out.println();
        
        //利用二分查找法（只能查找有序的数组）查找指定的整数
        int seaInt = Arrays.binarySearch(arrInt,search);
        if (seaInt >= 0){
            System.out.println(search + "是数组的第" + (seaInt+1) + "位元素");
        }else{
            System.out.println(search + "不是数组的元素");
        }        
        scan.close(); //关闭输入流
	}
}
