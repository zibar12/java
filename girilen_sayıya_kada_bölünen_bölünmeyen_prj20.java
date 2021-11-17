package ilk;

import java.util.Scanner;

public class proje20 {

	public static void main(String[] args) {
		//girilecek olan sayıya kadar olan sayılardan 10 a bölünenleri ve bolünmeyenleri kullanıcıya sorara yazan program..
		Scanner sca=new Scanner(System.in);
		int s1,ks,bs,tb=0,tba=0,bb=0,tbb=0,ttb=0,ttbb=0,sec;
		System.out.println("1 - 10 tam bölünenler...");
		System.out.println("2 - 10 bölünemeyenler...");
		sec=sca.nextInt();
		System.out.println("sayı giriniz..:");
		s1=sca.nextInt();
		if(sec==1) {//10 bölüm
			while(tb<s1) {
				tb++;
				if(tb%10==0) {
					
					tba=tba+1;
					ttb=ttb+tb;
					//System.out.println("10 tam bölünen"+tba+" tane sayı vardır");
					
				}
				
				
				
			}
			
			System.out.println(tba+" tane sayı vardır");
			
			System.out.println(ttb+" sayıların toplamlar..");
			
		}
		else if(sec==2) {//10 bölünmeyen
			while(bb<s1) {
				bb++;
				if(bb%10!=0) {
					
					tbb=tbb+1;
					ttbb=ttbb+bb;
					//System.out.println("10 bölünemeyen "+tbb+" kadar sayı vardır");
					
					
					
					
				}
				
				
				
				
			}
			
			System.out.println(tbb+" tane sayı vardır");
			System.out.println(ttbb+" sayıların taoplamı..");
			
		}
		
		

	}

}
