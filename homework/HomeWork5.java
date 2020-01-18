package homework;
import java.util.Scanner;
public class HomeWork5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner a =new Scanner(System.in);
//		System.out.println("Please input the width and height ");
//		starSquare b =new starSquare();
//		b.starSquare(a.nextInt(),a.nextInt());
//		randPick c = new randPick();
//		c.randAvg();
//			int[][] intArray= {
//					{1,6,3},
//					{9,5,2}
//			};
//		Sortting a= new Sortting();
//		System.out.println(a.maxElement(intArray));
		//test123
			randomtest a =new randomtest();
			a.genAuthCode();
	}	
}

class randomtest{	
	
	void genAuthCode() {
		int[] chart=new int[52];
		for(int i =0;i<26;i++) {
			chart[i]=65+i;
			if(chart[i]==90) {
				for(int j=26;j<52;j++) {
				chart[j]=71+j;
				}
			}
		}
		
		char[] charta =new char[52];
		for(int i = 0 ;i<52;i++) {
			charta[i]=(char)(chart[i]);
//			System.out.println(charta[i]);
		}
		int[] intn=new int[10];
		for(int i = 0 ;i<10;i++) {
			intn[i]=48+i;
		}
		char[] intna=new char[10];
				for(int i = 0 ;i<10;i++){
					intna[i]=(char)(intn[i]);
		}
			
	char[] charint = new char[8];
	for(int i=0;i<charint.length;i++) {
		int z =(int)(Math.random()*8);
		for(int j =0; j<i;j++){
			int x =(int)(Math.random()*52-1);
			int y =(int)(Math.random()*10);
			while(j==z) {
				j=0;
				 z =(int)(Math.random()*8);
			}
			if(z%2==0) {
				charint[j]=charta[x];
				}
				else {
				charint[j]=charta[y];
				}
		}
	}
	
	System.out.println("=========================");
	for(int i=0;i<charint.length;i++) {
		System.out.print(charint[i]);
	}
	
	

	
		
	}
	
	
	
	
}















///* 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與 高時，即會印出對應的*長方形，*/
//class  starSquare {
//	int width;
//	int height; 
//	
//		void starSquare(int width, int height){
//				 this.width=width;
//				 this.height=height;
//				
//				 for (int i=1;i<=height;i++) {
//					 			System.out.print("*");
//					 	for(int j=1;j<width;j++) {
//						 		System.out.print("*");
//					 }
//					 	System.out.println();
//				 }
//		}	
//}
//
///* 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值 並印出這10個亂數與平均值*/
//class randPick{
//		void randAvg() {
//			int mean=0;
//			int[] a = new int[10];
//			for(int i =0;i<10;i++) {
//				a[i]=(int) (Math.random()*100);
//				}
//			System.out.print("The Ten random numbers are : ");
//			for(int j=0;j<10;j++) {
//				System.out.print("\t"+a[j]);
//				mean+=a[j]/10;
//			}
//			System.out.println();
//			System.out.println("The mean is " +mean);
//		}
//}

///* 請設計一個方double maxElement(int x[][])與double maxElement(double x[][])，可以找出二維陣列的最大值並回傳*/
//class Sortting{
//		int[][] a ;
//		double[][]b;
//		
//		double maxElement(int[][] a ) {
//			this.a=a;
//			int c=0,d=0;
//			for(int i=0;i<a.length;i++) {
//				for(int j =0;j<a[i].length;j++) {
//					if(i==0) {
//							if(a[i][j]<a[i][j+1]&&a[i][j-1]<a[i][j]) {
//								c=a[i][j+1];
//							}
//							else if (a[i][j]>a[i][j+1]&&a[i][j-1]<a[i][j]){
//								c=a[i][j];
//								}
//							else {
//								c=a[i][j-1];
//							}
//						}
//					if(i==1) {
//							if(a[i][j]<a[i][j+1]&&a[i][j-1]<a[i][j]) {
//								d=a[i][j+1];
//							}
//							else if (a[i][j]>a[i][j+1]&&a[i][j-1]<a[i][j]){
//								d=a[i][j];
//								}
//							else {
//								d=a[i][j-1];
//							}
//						}
//					}
//				}
//									if(c>d) {
//										return c;
//									}
//									else {
//										return d;
//									}
//			}
//		}
//	
