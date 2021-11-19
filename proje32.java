package ilk;

import java.util.Scanner;

public class proje32 {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		String iban;
		System.out.println("ıban giriniz...:");
		iban=sca.next();
		int uzu;
		uzu=iban.length();//uzunkuk
		if(uzu==16) {
			int bs=4,ks=0;
			
			for(int bb=0;bb<4;bb++) {
				
				String ss=iban.substring(ks,bs);//substring(nerden,nereye)
				bs=bs+4;
				ks=ks+4;
				System.out.println(ss);
			}
		
		}
		else {
			
			System.out.println("hatalı girdiniz...");		
		}
	}

}
