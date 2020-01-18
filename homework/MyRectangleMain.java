package homework;
import java.util.Scanner;
public class MyRectangleMain{
	public static void main(String[] args) {
		Scanner sin =new Scanner(System.in);
		System.out.println("Please input the width and depth");
		MyRectangle a =new MyRectangle(sin.nextDouble(),sin.nextDouble());
		System.out.println("The rectangle are is "+a.getArea());
	}
}
/*• 請設計一個類別MyRectangle：      
 * (1) 有兩個double型態的屬性為width, depth     
 * (2) 有三個方法：  
 *  void setWidth(double width):將收到的引數指派給width屬性  
 *  void setDepth(double depth):將收到的引數指派給depth屬性  
 *  double getArea():能計算該長方形的面積     
 *   (3) 有兩個建構子：  
 *   public MyRectangle(): 不帶參數也無內容的建構子  
 *   public MyRectangle(double width, double depth): 傳入的兩個引數會存到對應的屬性 • 
 *   請另外編寫一個MyRectangleMain類別，此類別只有main方法 
 *   (1) 使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果 
 *   (2) 使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20， 透過getArea()印出結果*/

class MyRectangle{
	private double width=0,depth=0;
	
	public MyRectangle() {
		
	}
	public MyRectangle(double width,double depth) {
		this.width=width;
		this.depth=depth;		
	}
	void setDepth(double depth) {
		this.depth=depth;
	}
	void setWidth(double width) {
		this.width=width;
	}
	double getArea() {
		double rArea=width*depth;
		return rArea;
	}
	
}