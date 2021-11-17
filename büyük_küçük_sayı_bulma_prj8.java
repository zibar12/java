package ilk;

import java.util.Scanner;

public class proje8 {

	public static void main(String[] args) {
		
		Scanner sca=new Scanner(System.in);
		System.out.println("1 sayı : ");
		int s1 =sca.nextInt();
		System.out.println("2 sayı : ");
		int s2 = sca.nextInt();
		if(s1>s2) {
			System.out.println("1 sayı 2 den büyüktür...");
			
			
		}
		else if(s1<s2) {
			System.out.println("1 sayı 2 den küçüktür...");
			
			
		}
		else {
			
			System.out.println("1 sayı 2 ye esittir...");
			
		}
	}

}
