public class proje33 {

	public static void main(String[] args) {
		//ad küçük soy isim büyük
		Scanner sca=new Scanner(System.in);
		String ad,soyad;
		String iban,tel;
		System.out.println("adınız..:");
		ad=sca.next();
		System.out.println("soyadınız..:");
		soyad=sca.next();
		System.out.println("iban giriniz..:");
		iban=sca.next();
		System.out.println("telefon giriniz..:");
		tel=sca.next();
		System.out.println("adınız "+ad.toLowerCase());
		System.out.println("soyadınız "+soyad.toUpperCase());
		System.out.println("telefonuz "+tel);
		
		for(int k=0;k<tel.length()-1;k++) {	
			System.out.println("");
            System.out.println("tel "+tel.charAt(k));
			
		}
		
		int s1=0,s2=4;
		int uzu=iban.length();
		if(uzu==16) {
		for(int j=0;j<4;j++) {
	
			String k4=iban.substring(s1, s2);
			s1+=4;
			s2+=4;		
			System.out.println("ibanınız "+k4);
			}
		}
		else {
			System.out.println("hatalı iban...");
		}
	}

}
