package exception;

public class ExampleOfTryCatch {

	public static void main(String[] args) {
		try {
			
			//int i = 20/0;    //java.lang.ArithmeticException: / by zero
			
			int[] arr = {1,2,3};
			System.out.println(arr[5]);    //java.lang.ArrayIndexOutOfBoundsException:
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
