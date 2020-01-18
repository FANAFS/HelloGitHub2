package homework;

public class HomeWork2 {

	public static void main(String[] args) {
//		//第一題
		System.out.println("請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000) ");
		int sum=0,count;
		for(count=2;count<=1000;count+=2) {
			sum+=count;
		}
		System.out.println(sum);
		System.out.println();

		//第二題
		System.out.println("請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)");
		int sum2=1;
			for (int i=1;i<=10;i++) {
				sum2*=i;
			}
			System.out.println(sum2);
			System.out.println();
			
			
			//第2-2題
			System.out.println("請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)");
			int sum22=1,wi=1;
				while (wi<=10) {
					sum22*=wi;
					wi++;
				}
				System.out.println(sum22);
				System.out.println();
///		
//		//第三題
	System.out.println("請設計一隻Java程式，輸出結果為以下："+"\t"+"1 4 9 16 25 36 49 64 81 100 "+"\n");
		int sum3=0;
			for (int i=1;i<=10;i++) {
				sum3=i*i;
					System.out.print(sum3+"\t");
				}
			System.out.println();
			System.out.println();
			
		//第四題
			System.out.println("阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字"
					+ "不論是個位數或是十位數。 請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些?總共幾個");
			System.out.println("阿文可選的數字有： ");
		int i,j, k=0;
		for(i=0 ;i<4;i++) {
			for(j=0 ;j<=9;j++) {
				if (i==4||j==4||(i==0&&j==0)) {
					continue;}
				System.out.print((i*10+j)+"\t");
						k++;
			}
			System.out.println();
		}
		System.out.println("而數字總共有 "+k+" 個");
		
		System.out.println();
		System.out.println();
		

//	
		System.out.println();
		System.out.println();
//
			System.out.println("直角三角形問題一");
					for(int m=10;0<m;m--) {
						//重複圈數依次遞減
						for(int n=1;n<=m;n++) {
							System.out.print(n);
							//n從1開始接續列印 ，數值最高不能超過迴圈重複次數
						}
							System.out.println();
							//每當接續列印結束後皆要換行
					}
//												
		System.out.println();
		
		System.out.println("直角三角形問題二");
				char q=64;
						for(int o=1;o<=5;o++) {
									/*
									 * 我曾將char  q=64寫在這裡，結果跳出非預期解，
									 * 後面被提醒說由於第二層for loop在跳出後char q=64 會一直被重複執行
									 */
									q++;	
								for(int p=1;p<=o;p++) {
									System.out.print(q);
								}
								System.out.println();
						}
	
	}
}
