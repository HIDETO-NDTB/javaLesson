package week1;

public class Valiablespractice {
	private int val1 = 0; //インスタンス変数
	private static int val2 = 0; //static変数

	public Valiablespractice(int val1,int val2) {
		this.val1 += val1;
		Valiablespractice.val2 += val2;
	}
	
	public void print() {
		System.out.println("val1= "+val1+",val2= "+val2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<3;i++) {
			Valiablespractice cs = new Valiablespractice(1,1);
			cs.print();
		}
		
		int num[] = {2,11,15,9};
		for(int i=0; i<num.length ;i++) {
			System.out.println(num[i]);
		}
		
		//Nested For loop
		int num_arr[] = {1,2,3,4,5};
		for(int i=0;i< num_arr.length;i++) {
			for(int j=0; j < i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		//Initialize 2D Array
 		int[][] arrayd1 = {
 				{1,2,3},
 				{4,5,6,9},
 				{7}
 		};
 		
 		System.out.println("Length of rows1 "+arrayd1[0].length);
 		System.out.println("Length of rows2 "+arrayd1[1].length);
 		System.out.println("Length of rows3 "+arrayd1[2].length);
 		
 		//print the element of 2D array using nested for loop
 		for(int i=0;i<arrayd1.length;++i) {
 			for(int j=0;j<arrayd1[i].length; ++j) {
 				System.out.print(arrayd1[i][j]+" ");
 			}
 		}
 		System.out.println();
 		
 		//enhanced for loop to print 2D array
 		for(int[] innerArray: arrayd1) {
 			for(int data: innerArray) {
 				System.out.print(data+" ");
 			}
 		}
 		System.out.println();
 		
 		//3D array
 		int[][][]test = {
 				{
 					{1,2,3},
 					{4,5,6},
 				},
 				{
 					{-4,-5,6,9},
 					{1},
 					{2,3}
 				}
 		};
 		
 		//print 3D array using enhanced for loop
 		for(int[][] array2D : test) {
 			for(int[] innerArray: array2D) {
 				for(int data:innerArray) {
 					System.out.print(data+" ");
 				}
 			}
 		}
 		System.out.println();
		
	}
}


