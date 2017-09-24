package demo11;
/**
 * ���л��뷴���л�
 * @author ding
 *
 */
import java.io.* ;

public class SerializableDemo {
	public static void main(String args[]) throws Exception{
        File f = new File("SerializedPerson") ;
        serialize(f) ;
        deserialize(f) ;
    }    
    // ���·���Ϊ���л����󷽷�
    public static void serialize(File f) throws Exception{
        OutputStream outputFile = new FileOutputStream(f) ;
        ObjectOutputStream cout = new ObjectOutputStream(outputFile) ;
        cout.writeObject(new Person("����", 25)) ;
        cout.close() ;
    }    
    // ���·���Ϊ�����л����󷽷�
    public static void deserialize(File f) throws Exception{
        InputStream inputFile = new FileInputStream(f) ;
        ObjectInputStream cin = new ObjectInputStream(inputFile) ;
        Person p = (Person) cin.readObject() ;
        System.out.println(p) ;
        cin.close() ;
    }
}
@SuppressWarnings("serial")
class Person implements Serializable{
    private String name ;
    private int    age ;    
    public Person(String name, int age){
        this.name = name ;
        this.age = age ;
    }    
    public String toString(){
        return " ������" + this.name + "�����䣺" + this.age ;
    }
} ;
