package ilk;
import java.util.Scanner;
public class proje36 {
	public static void main(String[] args) {
		//Soru-3 Girilecek olan sayı negatif olana kadar sayı girişine izin
		//veren ve negatif sayı girildiğinde girişi 
		//durduran ve daha sonra girilen sayıların toplamlarını ve adetlerini yazacak olan kodları yazınız?
		Scanner sca=new Scanner(System.in);
		int s1,toplam=0;
		while(true) {	
			System.out.println("sayı giriniz..:");
			s1=sca.nextInt();
			if(s1>0) {
				toplam=toplam+s1;
			}
			else{
				System.out.println(toplam);
				break;	
			}	
		}	
	}
}
