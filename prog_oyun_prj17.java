package ilk;

import java.util.Scanner;
import java.util.Random;
public class proje17 {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		//ZOR OYUN
		int ycan=1000,xcan=1000;
		int xsal,ysal;
		while(xcan>=0) {
			while(ycan>=0) {
				Random rand=new Random();
				System.out.println("x oyuncusu saldırınız : ");
				xsal=sca.nextInt();
				
				if(xsal==1) {//net hasar...
					ycan-=120;
					System.out.println("120 vurdunuz "+ycan+ " y oyuncusunun canı");
				}
				else if(xsal==2) {//sansa hasar...
					int ras=rand.nextInt(3);
					if(ras==0) {//30
						ycan-=30;
						System.out.println("y oyuncusuna 30 hasar verdiniz "+ycan+" y oyuncusunu canı "+xcan+"x oyuncuxunun canı");
						
					}
					else if(ras ==1) {//120
						ycan-=120;
						System.out.println("y oyuncusuna 120 hasar verdiniz "+ycan+" y oyuncusunu canı "+xcan+"x oyuncuxunun canı");
					}
					else if(ras == 2) {//240
						ycan-=240;
						System.out.println("y oyuncusuna 240 hasar verdiniz "+ycan+" y oyuncusunu canı "+xcan+"x oyuncuxunun canı");
						
					}
					
					
				}
				else if(xsal==3) {//ultı...
					int ras1=rand.nextInt(3);
					if(ras1==0||ras1==1) {
						ycan-=360;
						xcan-=120;
						System.out.println("y oyuncusuna 360 vurdunuz x oyuncusuna 120 vurdunuz...");
						System.out.println(ycan+" y oyuncusunu canı "+xcan+" x oyuncusunun canı ..");
						
					}
					else if(ras1==2) {
						xcan-=360;
						ycan-=120;
						System.out.println("y oyuncusuna 120 vurdunuz x oyuncusuna 360 vurdunuz...");
						System.out.println(ycan+" y oyuncusunu canı "+xcan+" x oyuncusunun canı ..");
						
						
					}
					
					
				}
				else {
					
					System.out.println("1 - 3 arasında gririniz...");
					
				}
				//-----------------------------------------------------

				System.out.println("y oyuncusu saldırınız : ");
				ysal=sca.nextInt();
				
				if(ysal==1) {//net hasar...
					xcan-=120;
					System.out.println("120 vurdunuz "+xcan+ " x oyuncusunun canı");
				}
				else if(ysal==2) {//sansa hasar...
					int ras=rand.nextInt(3);
					if(ras==0) {//30
						xcan-=30;
						System.out.println("x oyuncusuna 30 hasar verdiniz "+xcan+" x oyuncusunu canı "+ycan+"y oyuncuxunun canı");
						
					}
					else if(ras ==1) {//120
						xcan-=120;
						System.out.println("x oyuncusuna 120 hasar verdiniz "+xcan+" x oyuncusunu canı "+ycan+"y oyuncuxunun canı");
					}
					else if(ras == 2) {//240
						xcan-=240;
						System.out.println("x oyuncusuna 240 hasar verdiniz "+xcan+" x oyuncusunu canı "+ycan+"y oyuncuxunun canı");
						
					}
					
					
				}
				else if(ysal==3) {//ultı...
					int ras1=rand.nextInt(3);
					if(ras1==0||ras1==1) {
						xcan-=360;
						ycan-=120;
						System.out.println("x oyuncusuna 360 vurdunuz y oyuncusuna 120 vurdunuz...");
						System.out.println(ycan+" y oyuncusunu canı "+xcan+" x oyuncusunun canı ..");
						
					}
					else if(ras1==2) {
						ycan-=360;
						xcan-=120;
						System.out.println("x oyuncusuna 120 vurdunuz y oyuncusuna 360 vurdunuz...");
						System.out.println(ycan+" y oyuncusunu canı "+xcan+" x oyuncusunun canı ..");
						
						
					}
					
					
				}
				else {
					
					System.out.println("1 - 3 arasında gririniz...");
					
				}
			if(xcan<=0) {
				System.out.println(xcan+" x oyuncusunu canı "+ycan+" y oyuncusunun canı..");
				System.out.println("y oyuncusu kazandı....");
				
				
			}
			else if(ycan<=0) {
				System.out.println(ycan+" y oyuncusunu canı "+xcan+" x oyuncusunun canı..");
				System.out.println("x oyuncusu kazandı....");
				
			}
		
		
			}
		}
		

	}
}
