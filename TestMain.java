package demo12;
/**
 * 练习用static修饰主方法
 * @author ding
 *
 */
public class TestMain {
	/*
     * public：表示公共方法 
     * static：表示此方法为一静态方法，可以由类名直接调用
     * void：表示此方法无返回值 main：系统定义的方法名称
     * String args[]：接收运行时参数
     */
    public static void main(String[] args)
    {
        // 取得输入参数的长度
        int j = args.length;
        if (j != 2)
        {
            System.out.println("输入参数个数有错误！");
            // 退出程序
            System.exit(1);
        }
        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
    }
}
