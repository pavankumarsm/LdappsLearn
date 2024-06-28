package Stream;

import java.util.ArrayList;

interface Addition{
	int add(int a,int b);
}
interface Multiplication{
	int mul(int x, int y);
}
public class ExampleOfLambda {

	public static void main(String[] args) {
//		
//		int a=10;
//		int b=20;
//		
//		Solution m = ()->{
//				System.out.println(a*b);
//		};
//		m.run();
		
		Addition A1=(int a,int b)->{
			return (a+b);
		};
		
		System.out.println(A1.add(25,43));
		
		Multiplication m1 = (int x, int y)->{
			return x*y;
		};
		System.out.println(m1.mul(24,45));
		
		//creating thread 
		Runnable r1 = ()->{
			System.out.println("thread is running");
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		
	}

}
