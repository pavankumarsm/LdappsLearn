package exception;

import java.util.Scanner;

	class InvalidUserName extends Exception
	{
		public String getMessage() {
			return "invalid card name & try again";		
		}
	}
	class ATM {
		private int AccNum = 9902369;
		private int pin = 5470;
		private int EnterAccNum;
		private int EnterPin;
		public void acceptInput() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Account number");
			EnterAccNum = scan.nextInt();
			System.out.println("Enter the pin number");
			EnterPin= scan.nextInt();
		}
	
		public void validate() throws InvalidUserName {
			if(AccNum==EnterAccNum && pin==EnterPin) {
				System.out.println("collect ur money");
			}else {
				InvalidUserName iun = new InvalidUserName();
				System.out.println(iun.getMessage());
				throw iun;
			}	
		}
	}	
	class Bank{
		public void initiate() {
			ATM atm=new ATM();
			try {
				atm.acceptInput();
				atm.validate();
			}catch(Exception e) {
				try {
					atm.acceptInput();
					atm.validate();
				}catch(Exception f) {
					try {
						atm.acceptInput();
						atm.validate();
					}
					catch(Exception g) {
						System.out.println("your card is blocked");
					}
				}
			}
		}
	}
	public class DemoBank {
		public static void main(String[] args) {
			Bank b = new Bank();
			b.initiate();
		}
	
	}
