package main;

import java.util.Scanner;

interface Calculator{
		void sum();
		void sub();
	}

	class Calculator1 implements Calculator{
	
		@Override
		public void sum() {
			int a=10;
			int b=25;
			
			System.out.println(a+b);
		}
	
		@Override
		public void sub() {
			int a=15;
			int b=10;
			System.out.println(a-b);
		}
		
	}
	
	class Calculator2 implements Calculator{
		
		Scanner scan = new Scanner(System.in);
		
		
		public void sum() {
			int x=scan.nextInt();
			int y = scan.nextInt();
			System.out.println(x+y);
		}
		
		public void sub() {
			int z = scan.nextInt();
			int p = scan.nextInt();
			System.out.println(z-p);
		}

	}

	public class ExampleOfInterface {
	
		public static void main(String[] args) {
			Calculator1 c1 = new Calculator1();
			Calculator2 c2 = new Calculator2();
			
			c1.sum();
			c1.sub();
			
			c2.sum();
			c2.sub();
			
		}
	
	}
