package demo3;
/**
 * ��ϰ�������ģʽ
 * @author ding
 *
 */
class Sex { // �Ա�
    private String title ;  // ������Ϣ
    private static final Sex MALE = new Sex("��") ;
    private static final Sex FEMALE = new Sex("Ů") ;
    private Sex(String title) {
        this.title = title ;
    }
    public static Sex getInstance(int ch) {//static����
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
