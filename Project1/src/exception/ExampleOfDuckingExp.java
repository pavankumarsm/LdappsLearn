package exception;

//Ducking Exception
class Demo1{
	void fun()throws Exception {
		System.out.println("connection2 is estd");
		
		
			int a=25;
			int b=0;
			System.out.println(a/b);
		
			System.out.println("exception is handled in fun()");
			
		
			System.out.println("connection2 is terminated");
		
	}
}

public class ExampleOfDuckingExp {

	public static void main(String[] args) {
		
		System.out.println("connection1 is Estd");
		try {
			Demo1 d1 =new Demo1();
			d1.fun();
		}
		catch(Exception e){
			System.out.println("exception handled in main() ");
		}
		System.out.println("connection is terminated");
	}

}

