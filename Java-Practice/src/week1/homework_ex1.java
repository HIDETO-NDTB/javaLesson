package week1;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class homework_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1.Write a Java program to print 'Hello' on screen and then print your name on a separate line");
		System.out.println("Hello");
		System.out.println("Hideto");
		System.out.println();
		
		System.out.println("Write a Java program to display the following pattern.");
		System.out.println("   J    a   v     v  a ");
		System.out.println("   J   a a   v   v  a a ");
		System.out.println("J  J  aaaaa   v v  aaaaa ");
		System.out.println(" JJ  a     a   v  a     a ");
		System.out.println();
		
		System.out.println("3.Write a Java program to print a face.");
		System.out.println(" +''''''''''+ ");
		System.out.println("[|  o   o   |] ");
		System.out.println(" |    ^     | ");
		System.out.println(" |  ' - '   | ");
		System.out.println(" + - - - - -+ ");
		System.out.println();
		
		System.out.println("4.Write a Java program to print an American flag on the screen.");
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ================================== ");
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ==================================");
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ==================================");
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ==================================");
		System.out.println("* * * * * * ==================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println();
		
		System.out.println("5.Write a Java program to check whether Java is installed on your computer.");
		System.out.println("Java Version: "+System.getProperty("java.version"));
	    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
	    System.out.println("Java Home: "+System.getProperty("java.home"));
	    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
	    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
	    System.out.println("Java Class Path: "+System.getProperty("java.class.path"));
		System.out.println();
		
		System.out.println("6.Write a Java program to print the following string in a specific format.");
		System.out.println("Twinkle, twinkle, little star,");
		System.out.println(" How I wonder what you are! ");
		System.out.println("       Up above the world so high,");
		System.out.println("       Like a diamond in the sky.");
		System.out.println("Twinkle, twinkle, little star,");
		System.out.println(" How I wonder what you are");
		System.out.println();
		
		System.out.println("7.Write a Java program to display the system time.");
		System.out.println(LocalDateTime.now());
		System.out.println();
		
		System.out.println("8.Write a Java program to display the current date time in specific format");
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
		System.out.println();
	}

}
