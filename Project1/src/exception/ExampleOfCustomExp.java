package exception;

//custom Exception
class MyOwnException extends Exception{
	
	public  MyOwnException(String msg) {
		super(msg);
		
	}
}

public class ExampleOfCustomExp {

	public static void main(String[] args) {
		try {
			int age =130;
			if(age>=100) {
				throw new MyOwnException( "age = "+age+" it is not possible   ");
			}
		}catch(MyOwnException e) {
			System.out.println(e);
		}
		System.out.println("execution is completed");
	}

}
