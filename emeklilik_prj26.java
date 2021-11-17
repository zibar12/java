package ilk;

import java.util.Scanner;

public class proje26 {

	public static void main(String[] args) {
		// adı soyadı isigirisi hizmet yılı durumu 25 yılda 2021
		Scanner sca=new Scanner(System.in);
		String ad,soyad;
		int isgir;
		int hdurum;
		int h1durum;
		System.out.println("adınız..:");
		ad = sca.nextLine();
		System.out.println("soyadınız..:");
		soyad = sca.nextLine();
		System.out.println("ise giris tarihiniz..:");
		isgir = sca.nextInt();
		hdurum=2021-isgir;
		h1durum=25-hdurum;
		if(hdurum>=25) {//emekli
			System.out.println("1adınız "+ad+" soyadınız "+soyad+" ise giris yılınız "+isgir+" hizmet yılı "+hdurum+" durumunuz emekli...");
			
			
			
			
		}
		else if(hdurum<25) {//yılı
			
			
			System.out.println("2adınız "+ad+" soyadınız "+soyad+" ise giris yılınız "+isgir+" hizmet yılı "+hdurum+" çalısmanız gereken "+h1durum+" yıl daha vardır..");
			
		}
		else {//hatalı giris
			
			System.out.println("hatalı yıl...");
					
			
		}
		

	}

}
