package stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) throws IOException {
		Employee e = new Employee();
		e.id=4567;
		e.name="Vipul";
		
		FileOutputStream fos= new FileOutputStream("emp.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("Data Saved");
		oos.close();		
	}

}
