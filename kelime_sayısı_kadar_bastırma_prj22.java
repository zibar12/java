package ilk;

import java.util.Scanner;

public class proje22 {

	public static void main(String[] args) {
		//girilecek olan kelimeyi karakter sayısı kadar alt alta yazan program
		Scanner sca=new Scanner(System.in);
		String krt;
		System.out.println("karakter giririniz:");
		krt=sca.nextLine();
		int uzunluk=krt.length();
		while(0<uzunluk) {
			uzunluk--;
			System.out.println(krt);
						
		}
		
	}

}
