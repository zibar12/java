package ilk;
import java.util.Scanner;
public class proje7 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		String g_kulan ="qwe";
		int g_parola =123;
		System.out.println("hosgeldiniz lütfen kulanıcı adınızı  giriniz :");
		String kulan = sca.nextLine();
		System.out.println("parolanızı giriniz : ");
		int parola = sca.nextInt();
		if(g_kulan.equals(kulan)&&g_parola == parola) {
			int bakiye=1000;
			System.out.println(bakiye +" tl bakiyeniz vardır.");
			System.out.println("1 - para yatırma.");
			System.out.println("2 - para çekme.");
			System.out.println("3 - bakiye sorgulayın");
			System.out.println("4 - sistemden çıksı");
			System.out.println("isleminiz : ");
			int islem = sca.nextInt();
			
			while(islem <= 3) {
			
			
			System.out.println(bakiye +" tl bakiyeniz vardır.");
			System.out.println("1 - para yatırma.");
			System.out.println("2 - para çekme.");
			System.out.println("3 - bakiye sorgulayın");
			System.out.println("4 - sistemden çıksı");
			System.out.println("isleminiz : ");
			islem = sca.nextInt();
			
			switch (islem) {
			case 1:
				
				System.out.println("Ne kadar yatıracaksınız : ");
				int ybaki = sca.nextInt();
				bakiye = bakiye + ybaki;
				System.out.println(ybaki + " tl yüklenerek toplam paranız "+bakiye +" tl olmustur..");
				break;
			case 2:
				System.out.println("Ne kadar çekeceksiniz : ");
				int çbaki = sca.nextInt();
				bakiye = bakiye - çbaki;
				System.out.println(çbaki + " tl yüklenerek toplam paranız "+bakiye +" tl olmustur..");
				break;
			case 3:
				System.out.println(bakiye + " tl bakiyeniz vardır...");
				break;
			case 4:
				System.out.println("islemden çıkılıyor...");
				
				
				break;

			default:
				System.out.println("hatalı islem girdiniz...");
				break;
			}
			
			
			}	
			
		}
	}

}
