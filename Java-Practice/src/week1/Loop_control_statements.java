package week1;

public class Loop_control_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//continue statement
		for(int i=0;i<=6;i++) {
			if(i == 4) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		//continue - while loop
		int counter = 10;
		while(counter >= 0) {
			if(counter==7) {
				counter--;
				continue;
			}
			System.out.print("\n"+counter+" ");
			counter--;
		}
		
		System.out.println();
		
		//continue - do-while
		int j=0;
		do {
			if(j==5) {
				j++;
				continue;
			}
			System.out.print(j+" ");
			j++;
		}while(j<=10);
		
		System.out.println();
		
		//Break
		int var;
		for(var=10;var >=0; var--) {
			System.out.println("value:"+var);
			if(var==5) {
				break;
			}
		}
		System.out.println("Exit for loop");
		
		//Break - while loop
		int num = 0;
		while(num <= 10) {
			System.out.println("Value of variable is "+num);
			if(num == 5) {
				break;
			}
			num++;
		}
		System.out.println("Exit while loop");
		
		//Break - do while loop
		int i=0;
		do {
			System.out.println("Value"+i);
			if(i == 3) {
				i++;
				break;
			}
			i++;
		}while(i<=10);
		System.out.println("Exit do-while loop");
		
		//Break - switch case
		int ex = 2;
		switch(ex) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		case 3:
			System.out.println("Case 3");
			break;
		default:
			System.out.println("Default");
		}
	}

}
