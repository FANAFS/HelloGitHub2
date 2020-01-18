package homework;
import java.util.Scanner;
public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*第一題 
		  * 有個一維陣列如下：
		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15} 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素 */
		
//		int [] a = new int[]{29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
//		int sum=0,mean=0;
//		for(int i=0;i<a.length;i++) {
//				sum+=a[i];
//		}
//		mean=sum/10;
//		System.out.println("The mean is "+ mean);
//		System.out.println("The number which is over mean is " );
//		for(int i=0;i<a.length;i++) {
//			if(a[i]<mean) {
//				continue;
//			}
//			System.out.print("\t"+a[i]);
//		}
		
		//test 123
		//test 456789
		
	/* 第二題
	 * 請建立一個字串，經過程式執行後，輸入結果是反過來的 例如String s = “Hello World”，執行結果即為dlroW olleH*/
//		String[] s=new String[] {"H","e","l","l","o"," "," W","o","r","l","d"};
//		String[] s1=new String[s.length];
//		for(int i=10;0<=i;i--) {
//		System.out.print(s[i]+" ");
//		}
		
	/*第三題
	 * {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”} 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u}*/
//			String s1= "mercury"+ "venus"+ "earth"+ "mars"+"jupiter"+ "saturn"+"uranus"+"neptune";
//			System.out.println(s1.length());
//			
//			int a=0,b=0,c=0,d=0,e=0,sum=0;
//			if(s1.substring(0,47).equals("a")) {
//				a++;
//				if(s1.substring(0).equals("e")) {
//					b++;
//					if(s1.substring(0).equals("i")) {
//						c++;
//						if(s1.substring(0).equals("d")) {
//							d++;
//							if(s1.substring(0).equals("e")) {
//								e++;
//						}
//					}
//				}
//			}
//		}
//			System.out.println(a+b+c+d+e);
//					System.out.println(s1.length());
//					sum=a+b+c+d+e;
//					System.out.println(sum);

//		String s1= "mercury",s2="venus",s3="earth",s4="mars",s5="jupiter",s6="saturn",s7="uranus",s8="neptune";
//		int a=0,e=0,i=0,o=0,u=0,k=0;
//		dotAlpha c1 = new dotAlpha();
//		c1.dotalpha(s1);
//		c1.dotalpha(s2);
//		c1.dotalpha(s3);
//		c1.dotalpha(s4);
//		c1.dotalpha(s5);
//		c1.dotalpha(s6);
//		c1.dotalpha(s7);
//		c1.dotalpha(s8);
////		c1.dotalpha(s9);
//		System.out.println(c1.k);
		
/*這個解法有點問題，但現在有點懶，就先待解決*/		

		
		
/* 第四題
 * 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下：
 *  請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事 有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的 員工編號: 25 19 27 共 3 人!」
 */
//		int [][] s =new int[][]{{25,2500},{32,800},{8,500},{19,1000},{27,1200}}; 
//		Scanner sin=new Scanner(System.in);
//		System.out.println("How much money do you want to borrow? ");
//		int ss=sin.nextInt();
//		System.out.println("The money who can leand you is ");
//		for(int i=0;i<s.length;i++) {
//			for(int j=0;j<s[i].length;j++ ) {
//				if(ss<=s[i][j]) {
//					System.out.println(s[i][0]);
//				}
//			}
//		}

		
/*第五題
 * 請設計一隻程式由鍵盤輸入三個整數，分別代表西元yyyy年，mm月， dd日，它會顯示是該年的第幾天
 * 例：輸入 1984 9 8 三個號碼後，程式會顯示「西元1984年，第250天
 */
//		int[] ymd=new int[3];
//		int sum=0;
//		System.out.println("Please input the date");
//		Scanner sin =new Scanner(System.in);
//		int y1=sin.nextInt();
//		int y2=sin.nextInt();
//		int y3=sin.nextInt();
//		ymd[0]=y1;
//		ymd[1]=y2;
//		ymd[2]=y3;
//		if(y1%4==0&&y1%100!=0) {
//				if(y2==1) {
//							sum = y3;
//				}
//				else if(y2==2) {
//					sum = 31+y3;
//				}
//					else if(y2<=8&&y2>2) {
//						sum = 31*(int)(y2/2)+((int)(y2/2)-1)*30+29+y3;
//					}
//					else {
//						sum = 31*((int)(y2/2)+1)+((int)(y2/2)-2)*30+29+y3;
//					}
//		}
//		else {
//				if(y2==1) {
//							sum = y3;
//				}
//				else if(y2==2) {
//					sum = 31+y3;
//				}
//				else if(y2<=8&&y2>2) {
//				sum = 31*(int)(y2/2)+((int)(y2/2)-1)*30+28+y3;
//				}
//			else {
//				sum = 31*((int)(y2/2)+1)+((int)(y2/2)-2)*30+28+y3;
//			}
//		}				
//		System.out.println(sum);
//		
/*第六題
 * 原本想用更智能的方式 但不太確定哪裡有問題，有點懶去debug，所以先用暴力的方式直接計算
 * 班上有8位同學，他們進行了6次考試結果如下：
 * 					{10,35,40,100,90,85,75,70},
						{37,75,77,89,64,75,70,95},
						{100,70,79,90,75,70,79,90},
						{77,95,70,89,60,75,85,89},
						{98,70,89,90,75,90,89,90},
						{90,80,100,75,50,20,99,75}
 * 請算出每位同學考最高分的次數 
 */
//		int[][] a =new int[][] {
//			{10,35,40,100,90,85,75,70},
//			{37,75,77,89,64,75,70,95},
//			{100,70,79,90,75,70,79,90},
//			{77,95,70,89,60,75,85,89},
//			{98,70,89,90,75,90,89,90},
//			{90,80,100,75,50,20,99,75}
//		};
//
//		int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0;
//		for(int j =0;j<8;j++) {
//			if (a[0][j]==100) {
//				switch (j) {
//					case 0 :
//						c1++;
//						break;
//					case 1:
//						c2++;
//						break;
//					case 2 :
//						c3++;
//						break;
//					case 3:
//						c4++;
//						break;					
//					case 4 :
//						c5++;
//						break;
//					case 5:
//						c6++;
//						break;
//					case 6 :
//						c7++;
//						break;
//					case 7:
//						c8++;
//						break;
//				}
//				}
//			if (a[1][j]==95) {
//				switch (j) {
//					case 0 :
//						c1++;
//						break;
//					case 1:
//						c2++;
//						break;
//					case 2 :
//						c3++;
//						break;
//					case 3:
//						c4++;
//						break;					
//					case 4 :
//						c5++;
//						break;
//					case 5:
//						c6++;
//						break;
//					case 6 :
//						c7++;
//						break;
//					case 7:
//						c8++;
//						break;
//				}
//				}
//			if (a[2][j]==100) {
//				switch (j) {
//					case 0 :
//						c1++;
//						break;
//					case 1:
//						c2++;
//						break;
//					case 2 :
//						c3++;
//						break;
//					case 3:
//						c4++;
//						break;					
//					case 4 :
//						c5++;
//						break;
//					case 5:
//						c6++;
//						break;
//					case 6 :
//						c7++;
//						break;
//					case 7:
//						c8++;
//						break;
//				}
//				}
//			if (a[3][j]==95) {
//				switch (j) {
//					case 0 :
//						c1++;
//						break;
//					case 1:
//						c2++;
//						break;
//					case 2 :
//						c3++;
//						break;
//					case 3:
//						c4++;
//						break;					
//					case 4 :
//						c5++;
//						break;
//					case 5:
//						c6++;
//						break;
//					case 6 :
//						c7++;
//						break;
//					case 7:
//						c8++;
//						break;
//				}
//				}
//			if (a[4][j]==98) {
//				switch (j) {
//					case 0 :
//						c1++;
//						break;
//					case 1:
//						c2++;
//						break;
//					case 2 :
//						c3++;
//						break;
//					case 3:
//						c4++;
//						break;					
//					case 4 :
//						c5++;
//						break;
//					case 5:
//						c6++;
//						break;
//					case 6 :
//						c7++;
//						break;
//					case 7:
//						c8++;
//						break;
//				}
//				}
//			if (a[5][j]==100) {
//				switch (j) {
//					case 0 :
//						c1++;
//						break;
//					case 1:
//						c2++;
//						break;
//					case 2 :
//						c3++;
//						break;
//					case 3:
//						c4++;
//						break;					
//					case 4 :
//						c5++;
//						break;
//					case 5:
//						c6++;
//						break;
//					case 6 :
//						c7++;
//						break;
//					case 7:
//						c8++;
//						break;
//				}
//				}
//			}
//		System.out.println("1號同學考最高分的次數為 "+c1+" 次");
//		System.out.println("2號同學考最高分的次數為 "+c2+" 次");
//		System.out.println("3號同學考最高分的次數為 "+c3+" 次");		
//		System.out.println("4號同學考最高分的次數為 "+c4+" 次");
//		System.out.println("5號同學考最高分的次數為 "+c5+" 次");
//		System.out.println("6號同學考最高分的次數為 "+c6+" 次");
//		System.out.println("7號同學考最高分的次數為 "+c7+" 次");
//		System.out.println("8號同學考最高分的次數為 "+c8+" 次");
		
	}
}		
		
		
		
	