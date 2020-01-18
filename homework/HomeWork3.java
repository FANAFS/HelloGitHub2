package homework;
import java.util.Scanner;
public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner a = new Scanner(System.in);
//		Scanner b = new Scanner(System.in);
//		Scanner c = new Scanner(System.in); 
//		System.out.println("請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，如圖示結果：");
//		int aa=a.nextInt(),bb=b.nextInt(),cc=c.nextInt();
//		if(aa==bb&&aa==cc&&aa!=0) {
//				System.out.println("正三角形");
//		}
//		else if(aa==bb&&bb!=cc&&aa!=0) {
//			if(aa+bb>cc &&  aa+cc>bb && bb+cc>aa) {
//			System.out.println("等腰三角形");
//		}
//			else {
//				System.out.println("不是三角形");
//			}
//		}
//		else if (aa!=bb&&bb!=cc) {
//			if(aa+bb>cc &&  aa+cc>bb && bb+cc>aa&&((int)(Math.pow(aa,2))+(int)(Math.pow(bb,2))==(int)(Math.pow(cc,2)))) {
//					System.out.println("直角三角形");
//						}
//				else
//					System.out.println("其他三角形");
//				}
//
//		else {
//			System.out.println("不是三角形");
//		}
//
//System.out.println("================================================================================");				
//
//						System.out.println("請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜 錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果");
//						 Scanner r =new Scanner(System.in);
//						 int  rr1=(int)(Math.random()*10)+1;
//					 	for(int i =1 ;0<i;i++){
//					 		int rr = r.nextInt();
//					 		if(rr==rr1) {
//					 			System.out.println("Great answer ! The answer is "+rr);
//					 			break;
//					 		}
//					 		else {
//					 			System.out.println("Error ! Try again ! ");
//					 		}
//					 	}
//					 	
//System.out.println("===========進階2===========");			 	
//
//		System.out.println("產生0～100亂數，每次猜就會提示你是大於還是小於正確答案");
//		Scanner r2 = new Scanner(System.in);
//		 int  rr2=(int)(Math.random()*101);
//		 	for(int i =1 ;0<i;i++){
//	 		int r22 = r2.nextInt();
//	 		if(r22>rr2) {
//	 			System.out.println("Too huge  ! Try again !");
//	 		}
//	 		else if(r22<rr2) {
//	 			System.out.println("Too small  !  Try again ! ");
//	 		}
//	 		else
//	 			System.out.println("Great answer ! The answer is "+rr2);
//	 	}
//		 
//System.out.println("================================================================================");				
//
//		System.out.println(" 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4， 但這次他想要依心情決定討厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字，畫面會顯示他可以選擇的號碼與總數");
//				Scanner h =new Scanner(System.in);
//				System.out.printf("Please the number what you hate : " );
//				int hh=h.nextInt();
//				System.out.printf("The answer is " );
//				int k=0;
//				for(int p=0; p <=4;p++) {
//					for(int q=0;q<=9;q++) {
//								if(p==hh||q==hh||(p==0&&q==0)) {
//									 continue;
//								}
//											 System.out.printf("%2d ",(p*10+q));
//											 k++;
//										}
//							}
//				System.out.println();
//				System.out.println("The total numbers are " + k);
//				
System.out.println("===========進階三====================");	
		
//		System.out.println(" 輸入不要的數字後，直接亂數印出6個號碼且不得重覆");
//		Scanner h1 =new Scanner(System.in);
//		System.out.printf("Please the number what you hate : " );
//		int h11=h1.nextInt();
//		int test,test1;
//		System.out.printf("The answer is " );
//		for(int t=1;t<=6;t++) {
//			int x=(int)(Math.random()*49)+1;
//			for(int p=0; p <=4;p++) {
//				for(int q=0;q<=9;q++) {
//						if(p==h11||q==h11||(p==0&&q==0) ) {
//								else if(x!=p*10+q||x!=q) {
//										x=test1;
//							}
//								continue;
//						}
//						test =p*10+q;
//				}
//			}
//		}
//			System.out.printf("%2d  ",x);	
//	}
//		
//			}
}

}