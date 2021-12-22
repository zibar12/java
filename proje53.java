package ilk;

public class proje53 {
	static boolean asalmi(int a) {
		for(int i=2;i<a;i++) {
			if(a%i==0) {		
				return false;
			}
		}
				return true;
	}
	static void asal() {//1 den 1000 kadar asal sayıları yazdırma
		int a;
		int b=1000;
		for(a=2;a<b;a++) {
			if(asalmi(a)) {
				System.out.println(a);
			}
		}
	}
	public static void main(String[] args) {
		asal();	
	}
}
