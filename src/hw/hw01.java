package hw;

import java.util.Scanner;

public class hw01 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println(fun(scn.nextInt(), scn.nextInt()));
	}

	public static float fun(int a, int b) {
		// TODO Auto-generated method stub
		float n=0;
		switch (b){
		case 1:
			n=a*5/9+32;
		break;
		case 2:
			n=(a-32)*((float)5/9);
		break;
	}
		
		return n;
	}

}
