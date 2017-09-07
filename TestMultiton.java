package demo3;
/**
 * 练习多例设计模式
 * @author ding
 *
 */
class Sex { // 性别
    private String title ;  // 保存信息
    private static final Sex MALE = new Sex("男") ;
    private static final Sex FEMALE = new Sex("女") ;
    private Sex(String title) {
        this.title = title ;
    }
    public static Sex getInstance(int ch) {//static方法
        switch (ch) {
            case 0 :
                return MALE ;
            case 1 :
                return FEMALE ;
            default:
                return null ;
        }
    }
    public String toString() {
        return this.title ;
    }
}
public class TestMultiton {
	public static void main(String[] args) {
		System.out.println(Sex.getInstance(1));
	}
}
