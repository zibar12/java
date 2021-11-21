package ilk;
import java.util.Scanner;
public class proje37 {

	public static void main(String[] args) {
		// Soru Girilecek olan sayıya kadar olan sayılardan yine girilecek olan 
		//sayıya tam bölünmeyenlerin toplamlarını veren kodları yazınız?
		Scanner sca=new Scanner(System.in);
		int s1,s2,citop=0,ttop=0,ks=0,bs=0;
		System.out.println("1 sayıyı giriniz..:");
		s1=sca.nextInt();
		System.out.println("2 sayıyı giriniz..:");
		s2=sca.nextInt();
		if(s1>s2) {//büyük küçük kontroli
			bs=s1;
			ks=s2;
		}
		else if(s1<s2) {
			bs=s2;
			ks=s1;
		}
		for(;ks<bs;ks++) {
			if(ks%2==1) {
				ttop+=ks;
			}
			else if(ks%2==0) {
				citop+=s1;
			}
			System.out.println("tek sayıların toplamı "+ttop);
			System.out.println("çift sayıların topllamı "+citop);
		}
	}

}
