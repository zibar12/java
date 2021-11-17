package ilk;
import java.util.Scanner;
public class proje5 {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		System.out.println("sayı giriniz:");
		int b = x.nextInt();
		if(b>100) {
			
			System.out.println("sayınız 100 den büyük");
			
		}
		else {
			System.out.println("sayınız doğrudur");
		}
		

	}

}
