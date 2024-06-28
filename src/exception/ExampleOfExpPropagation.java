package exception;


class ExceptionPropagation{
	void a() {
		
		int x = 10/0;

	}
	void b() {
		a();
	}
	void c() {
		try {
			System.out.println("Connection is Estd");
			b();
		}catch(Exception e) {
			System.out.println("Exception is Handled");
		}
	}
}



public class ExampleOfExpPropagation {
	
	public static void main(String[] args) {
		ExceptionPropagation Ep = new ExceptionPropagation();
		Ep.c();
		System.out.println("Connection is Terminated");
	}
}
