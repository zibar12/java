package ilk;
import java.util.Scanner;
public class proje35 {

	public static void main(String[] args) {
		// Soru-2 Girilecek olan kelimeyi ilk harf büyük olacak şekilde bir büyük bir küçük harfler 
		//şeklinde harf harf alt alta ekrana yazacak olan programı kodlayınız?
		Scanner sca=new Scanner(System.in);//toLoverCase toUpperCase leght charAt kelime alta alma
		String kel;
		int skel;
		System.out.println("kelime giriniz..:");
		kel=sca.next();
		skel=kel.length();
		for(int i=0;i<skel;i++) {
			if(i%2==1) {
				System.out.println("");
				System.out.println(kel.toLowerCase().charAt(i));
			}
			else {
				System.out.println("");
				System.out.println(kel.toUpperCase().charAt(i));	
			}	
		}	
	}
}
