package week1;

public class MultiArray_Additional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {
				{1,3},
				{3,4}
		};
		
		int b[][] = {
				{1,3},
				{3,4}
		};
		
		int c [][] = new int[2][2];
		
        System.out.println("Addition of 2 matrics");
        
        //Adding and printing the 2D array
        for(int i=0;i<2;i++) {
        	for(int j=0;j<2;j++) {
        		c[i][j] = a[i][j] + b[i][j];
        		System.out.print(c[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
