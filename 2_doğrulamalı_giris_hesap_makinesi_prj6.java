public class proje6 {

	public static void main(String[] args) {
			
			Scanner sca =new Scanner(System.in);
			//2 li parolalı sifre ilki 123 2 sifre 1221
			String gkul="qwe";
			int gsif=123;
			int gparola=1221;
			System.out.println("kullanıcı adınız :");
			String kul = sca.nextLine();
			System.out.println("sifreniz : ");
			int sif = sca.nextInt();
			
			if((kul.equals(gkul)) && sif == gsif) {
				
				System.out.println("sisteme girdiniz 2 sifreniz");
				int parola = sca.nextInt();
				if(parola == gparola) {	
					
					System.out.println("sistem girdiniz ");		
					System.out.println("isleminiz seçin...");
					System.out.println("1 - toplam ,2 - çıkarma , 3- çarpma ,4 - bölme");
					int islem = sca.nextInt();
					System.out.println("1 sayıyı giriniz : ");
					double sayi1 =sca.nextDouble();
					System.out.println("2 sayıyı giriniz : ");
					double sayi2 = sca.nextDouble();
					
				
					switch (islem) {
					
					case 1:
						double gsayi= sayi1 + sayi2;
						System.out.println("sayıların toplamaı "+gsayi+" dir");
						break;
					case 2:
						double gsay2 = sayi1 - sayi2;
						System.out.println("sayiların çıkarılması "+gsay2+" dır");
						
						break;
						
					case 3:
						double gsayi3 = sayi1 *sayi2;
						System.out.println("sayiların çarpımı "+gsayi3+" dır");
						
						break;
						
					case 4:
						double gsayi4 = sayi1/sayi2;
						System.out.println("sayiların bölümü "+gsayi4+" dır");
						break;
						
						
					default:
						System.out.println("farklı bir sayı girdiniz");
						
						break;
					}
				}
			
				
				else{
					System.out.println("sistemden atıldınız");
				}

			}	
		
			else if(!(kul.equals(gkul))&& sif == gsif) {
				
				System.out.println("sifreniz yanlıstır");
				
			}
				

			else if((kul.equals(gkul))&& sif != gsif) {
				
				System.out.println("sifreniz yanlıstır");
				
			}
				
			
			else {
				System.out.println("kullanıcı ad ve parola yanlıstır");
				
			}
	}
}
