package j11;

import java.util.Scanner;

public class j11 {

	public static void main(String args[]){
		
		System.out.println("Enter Number");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		for(int i=0;i<=number-1;i++){
			if(i==number-1){
				int anynumber = (int) (number*Math.random());
			System.out.println(anynumber);
			}
		}
		
	}
}
