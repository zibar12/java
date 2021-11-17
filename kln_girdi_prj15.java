import java.util.Scanner;

public class proje15 {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		int s1,s2,top=0,ks,bs;
		System.out.println("1 sayı : ");
		s1=sca.nextInt();
		System.out.println("2 sayı : ");
		s2 =sca.nextInt();
		if(s1>s2) {
			bs=s1;
			ks=s2;
			
		}
		else {
			bs=s2;
			ks=s1;
			
					
		}
		
		
		
		
		for(int i = ks;i<=bs;i++) {
			
			
			top=top+i;
			
			
			
			
		}
		System.out.println(top);

	}

}
