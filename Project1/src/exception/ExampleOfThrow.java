package exception;


//throw ,throws, finally
class Demo{
	void fun()throws Exception {
		System.out.println("connection2 is estd");
		
		try {
			int a=25;
			int b=10;
			System.out.println(a/b);
		}catch(Exception e){
			System.out.println("exception is handled in fun()");
			throw e;
		}
		finally {
			System.out.println("connection2 is terminated");
		}
	}
}

public class ExampleOfThrow {

	public static void main(String[] args) {
		
		System.out.println("connection1 is Estd");
		try {
			Demo d1 =new Demo();
			d1.fun();
		}
		catch(Exception e){
			System.out.println("exception handled ");
		}
		System.out.println("connection is terminated");
	}

}
