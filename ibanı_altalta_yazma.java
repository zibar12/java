package ilk;

import java.util.Scanner;

public class proje24 {

	public static void main(String[] args) {
		// girilen iban numarasını 4 er 4er alt alta yazan programı kodlayın
		Scanner sca=new Scanner(System.in);
		
		System.out.println("iban giriniz..:");
		String iba=sca.nextLine();
		String ilk;
		int say;
		int s3=4;
		int s2=0;
		int uzu=iba.length();
		if(uzu==16) {
			
			for(int i=say=0;say<4;say++) {
				
				String s1 = iba.substring(s2,s3);
				System.out.println(s1);
				s3=s3+4;
				s2=s2+4;
			}
			
			
		}
		else {
			System.out.println("hatalı girdiniz...");
			
			
		}
		
	}

}
