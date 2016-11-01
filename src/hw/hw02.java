package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("請輸入身高、性別");
System.out.println(fun(scn.nextInt(), scn.nextInt()));
	}

	public static float fun(float a, int b) {
		// TODO Auto-generated method stub
		
		float n=0;
		switch (b){
		case 1:
			n=(float)((a-170)*0.6+62);
		break;
		case 2:
			n=(float)((a-158)*0.5+52);
		break;
	}
return n;
}
}
