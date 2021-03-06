package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Person1 implements Externalizable{
	
	String name;
	String job; //클래스는 직렬화를 해야되는데 직렬화 할 수 없는 멤버변수를 갖고 있으면 transient
	
	public Person1() {}
	public Person1(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", "+ job;
	}
	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {

		name = obj.readUTF();
		job = obj.readUTF();
		
	}
	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {

		obj.writeUTF(name);
		obj.writeUTF(job);
		
	}
}
public class ExternalizableTest {

	public static void main(String[] args) {
		
		Person1 personLee = new Person1("이순신", "대표이사");
		Person1 personKim = new Person1("김유신", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt"); //serialization
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		}catch(IOException e) {
			System.out.println(e);
		}
		try(FileInputStream fis = new FileInputStream("serial.txt"); //deserialization
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person1 pLee = (Person1)ois.readObject();
			Person1 pKim = (Person1)ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pKim);
		}catch(IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}