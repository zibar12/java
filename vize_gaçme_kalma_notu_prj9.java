package ilk;

import java.util.Scanner;

public class proje9 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("vize notunuz :");
		double vze = sca.nextDouble();
		System.out.println("final notunuz :");
		double fna = sca.nextDouble();
		double ort = vze*0.4+fna*0.6;
		if(ort>60) {
			System.out.println(ort+" notu ile geçtiniz");
		}
		else if(ort<60) {
			System.out.println(ort + " notu ile kaldınız");
		}
		else {
			System.out.println(ort + "notu ile büte girceksiniz");
		}
	}

}
