﻿package ex;
/*
 * Topic: 使用者輸入一個大正整數值，請設計一個函數fun1(n)可以計算該大數字裡的數字總合。例如:輸入: 4832 則輸出 17
 * Date: 2016/10/31
 * Author: 105021038 傅琬鈞
 */
import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
long n=scn.nextLong();
fun1(n);
	}

	public static void fun1(long n) {
		int sum=0;
		while(n>0){
			sum=(int)(sum+n%10);
			n=n/10;
			
		}System.out.println(sum);
	}

}
