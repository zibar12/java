package ilk;

import java.util.Scanner;

public class proje55_obob {
	static int ebob(int s1,int s2) {
		int ebo=1;
		for(int i=1;i<=s1 && i<=s2;i++) {
			if(s1%i==0 && s2%i==0) {
				ebo=i;
			}
		}
		return ebo;	
	}
	static int ekok(int s1,int s2) {
		int eko=1;
		for(int i=2;i<=s1 && i<=s2;i++) {
			if(s1%i==0 && s2%i==0) {
				eko=i;	
			}
			break;
		}
		return eko;	
	}
	public static void main(String[] args) {
		//ebob ekok bulma
		Scanner sca=new Scanner(System.in);
		int s1 ,s2,sec;
		System.out.println("1 sayı yı giriniz..:");
		s1=sca.nextInt();
		System.out.println("2 sayıyı girinizz..:");
		s2=sca.nextInt();
		System.out.println("1 ebob nulma 2 ekok bulma seciminiz..:");
		sec=sca.nextInt();
		if(sec==1) {//ebob bulma
			System.out.println(ebob(s1,s2));
		}
		else if(sec==2) {//ekok bulma
			System.out.println(ekok(s1,s2));
		}
		else {
			System.out.println("lütfen 1 yada 2 ye basınız..");
			
		}
	}
}
