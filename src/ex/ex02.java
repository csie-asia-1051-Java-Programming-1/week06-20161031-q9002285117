package ex;

/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021038 傅琬鈞
 */
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int c = m-n;
	
		System.out.println(a(m)/(a(n)*a(c)));
	}
	public static int a(int w){
		int sum1=1;
		for (int i = 1; i <= w; i++) {
			sum1 = sum1 * i;
		}
		return sum1;
	}

}
