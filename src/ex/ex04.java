package ex;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 105021038 傅琬鈞
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請問有幾筆資料:");
int n=scn.nextInt();
int data[]=new int[n];
for(int i=0;i<n;i++){
	data[i]=scn.nextInt();
	
}
square(data,n);

		




//String arr=scn.next();
//square(arr);
//	}
//
//	public static void square(String arr) {
//		for(int i=0;i<arr.length();i++){
//			
//			System.out.print();
//		}
//		
	}
	public static void square(int square[],int w){
		for(int i=0;i<w;i++){
			System.out.print(square[i]*square[i]+"\t");
		}
	}

}
