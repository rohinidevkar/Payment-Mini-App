import java.util.Scanner;

public class Banking {
	
	public int balance;
	public int transaction;
	public String name;
	public int amount;


	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			transaction = amount;
		}
	}

	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			transaction = - amount;

		}
	}

	void transfer(int amount) {

		withdraw(amount);
		deposit(amount);
		balance = balance - amount;
		transaction = amount;
	}

	void getTransaction() {
		if (transaction > 0) {
			System.out.println("Deposited:" +transaction);
		} else if (transaction < 0) {
			System.out.println("Withdrawn:" + Math.abs(transaction));
		}

		else {
			System.out.println("No transaction occur");
		}
	}

	 void showpass() {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int pass_code;
		System.out.println(
				"\n |||||----------------------------------------------------------------    Welcome to in our Service  ------------------------------------------------------------------  ||||| \n");
		System.out.println(
				"-*-*-*-*-*-*- LOGIN -*-*-*-*-*-*-  \n");

		System.out.print(
				"Enter Unique UserName:");
		name = sc.nextLine();
		System.out.print(
				"Enter Password:");
		pass_code = Integer.parseInt(
				sc.nextLine());

		if (name.equals("") || pass_code == 0) {
			System.out.println("All Field Required!");
		} else {
			System.out.println(name + ", Logged In!");
		}
		 System.out.println("Welcome " + name);
		 System.out.println("Your Id is " + pass_code);
	}


	public void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Transfer");

		System.out.println("E. Previous Transaction");
		System.out.println("F. Exit");

		do {

			System.out.println("-------------------------------------------------------------");
			System.out.println("Enter an option");
			System.out.println("-------------------------------------------------------------");
			option = scanner.next().charAt(0);
			System.out.println("\n");

			switch (option) {
			case 'A':
				System.out.println("-------------------------------------------------------------");
				System.out.println("Balance = " + balance);
				System.out.println("-------------------------------------------------------------");
				System.out.println("\n");
				break;

			case 'B':
				System.out.println("-------------------------------------------------------------");
				System.out.println("Enter an amount to deposit:");
				System.out.println("-------------------------------------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;

			case 'C':
				System.out.println("-------------------------------------------------------------");
				System.out.println("Enter an amount to withdraw:");
				System.out.println("-------------------------------------------------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;

			case 'D':
				System.out.println("-------------------------------------------------------------");
				System.out.println("Enter an amount to transfer:");
				System.out.println("-------------------------------------------------------------");
				int amount3 = scanner.nextInt();
				transfer(amount3);
				System.out.println("Amount transferred successfully");

				System.out.println("\n");
				break;

			case 'E':
				System.out.println("-------------------------------------------------------------");
				getTransaction();
				System.out.println("-------------------------------------------------------------");
				System.out.println("\n");
				break;

			case 'F':
				System.out.println("-------------------------------------------------------------");
				break;

			default:
				System.out.println("Invalid option! Please enter again");
				break;
			}

		} while (option != 'F');
		System.out.println("Thank you for the using our Service!...");
	}

}

