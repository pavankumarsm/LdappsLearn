package exception;

public class Exception2 {

	
	public static void main(String[] args) {
		String returnVal = method1();
		System.out.println(returnVal);
	}

	public static String method1() {
		try {
			int i = 9/1;
			System.out.println(i);
			
		} catch (Exception e) {
			System.out.println("exception caught");
			return "from catch";
		} finally {
			System.out.println("finally block executing");
		}
		System.out.println("end");
		return "from end";
	}

}