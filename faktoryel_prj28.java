package ilk;

import java.util.Scanner;

public class proje28 {

	public static void main(String[] args) {
		// faktoryel hesap
		Scanner sca=new Scanner(System.in);
		int s1;
		int s2=1;
		System.out.println("sayı giriniz..:");
		s1=sca.nextInt();
		for(;s1>0;s1--) {
			
			s2=s2*s1;
			
			
			
			System.out.println(s2);
			
			
		}
		System.out.println("toplam "+s2);
		

	}

}
