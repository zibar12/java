package ilk;

import java.util.Scanner;

public class proje54 {
	
	static int ebobbul(int s1,int s2) {
		int ebob=1;
		for(int i=1;i <= s1&&i <= s2; i++) {
			if((s1%i==0)&&(s2%i==0)) {
				ebob=i;
			}
		}
		return ebob;
	}
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.println(" ilk sayıyı giriniz..:");
		int s1=sca.nextInt();
		System.out.println("2 sayıyı giriniz..:");
		int s2=sca.nextInt();
		System.out.println(ebobbul(s1,s2));
	}
}
