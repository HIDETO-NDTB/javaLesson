package exception_handling;

import java.io.FileOutputStream;

public class TrywithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileOutputStream fileOutputStream = new FileOutputStream("ghi.docx")) {
			
			String msg = "Welcome to java";
			byte byteArray[] = msg.getBytes();//converting string into byte array
			fileOutputStream.write(byteArray);
			
			System.out.println("Message written to file successfully!");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
