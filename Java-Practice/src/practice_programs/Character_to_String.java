package practice_programs;

public class Character_to_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'a';
		
		//Method1
		String str = Character.toString(ch);
		System.out.println("String is "+str);
		
		//Method2
		String str2 = String.valueOf(ch);
		String str3 = str2+"pp";
		System.out.println("String is "+str3);
	}

}
