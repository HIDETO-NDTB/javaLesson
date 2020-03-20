package week1;

import java.util.Scanner;

public class Array_insert_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length,position,size;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("サイズの数を入力下さい");
		length = sc.nextInt();
		
		int arr[] = new int[length+1];
		System.out.println(length+ "個のサイズを入力下さい");
		for(int i=0; i<length; i++) {
			arr[i] = sc.nextInt();
		}
        System.out.println("サイズを追加したいポジションを入力下さい");
        position = sc.nextInt();
        
        System.out.println("追加したいサイズを入力して下さい");
        size = sc.nextInt();
        
        for(int i=length-1; i>=(position-1);i--) {
        	arr[i+1] = arr[i];
        }
        arr[position-1] = size;
        
        System.out.println("データ追加後");
        for(int i=0; i<length; i++) {
        	System.out.println("サイズ["+i+"] ="+ arr[i]);
        }
        System.out.println("サイズ[" +length+"]="+arr[length]);
	}

}
