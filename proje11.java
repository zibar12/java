package ilk;
import java.util.Scanner;

public class proje11 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		
		System.out.println("1 sınavınız : ");
		double s1 = sca.nextDouble();
		System.out.println("2 sınavınız : ");
		double s2 = sca.nextDouble();
		System.out.println("3 sınavınız : ");
		double s3 = sca.nextDouble();
		
		double orts=(s1+s2+s3)/3;
		
		if(orts>=0 && orts<=100) {
		while(orts>=0 && orts<=100) {
		if(orts>=0 && orts<24) {
			System.out.println(orts+" puanla 1 dir..");
			
		}
		else if(orts>=25 && orts<44) {
			System.out.println(orts+" puanla 2 dir..");
		}
		else if(orts>=45 && orts<54) {
			System.out.println(orts+" puanla 3 dir..");
			
		}
		else if(orts>=55 && orts<69) {
			System.out.println(orts+" puanla 4 dir..");
			
		}
		else if(orts>=70 && orts<84) {
			System.out.println(orts+" puanla 5 dir..");
			
			
		}
		else if(orts>=85 && orts<100) {
			
			System.out.println(orts+" puanla 5+ dır..");
			
			
		}
		break;
		}
		}
		else {
			System.out.println("ortalamanız 0 la 100 arasında degildir...");
		}
	}
	

}
