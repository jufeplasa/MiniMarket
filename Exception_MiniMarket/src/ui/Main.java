package ui;

import java.util.Scanner;

public class Main {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

		boolean conti=true;
		while(conti) {
			int choose=showMenu();
			switch(choose) {
			case 1:
				
				break;
				
			case 2:
				
				break;
				
			case 3:
				System.out.println("You have exit of th program");
				conti =false;
				break;
			}
		}
	}

	public static int showMenu() {
		int option;

		System.out.println(" Select an option ");
		System.out.println("1: Registered To get in");
		System.out.println("2: Show how many people try to get in");
		System.out.println("3: Exit of the program ");
		option=sc.nextInt();
		sc.nextLine();
		return option;
	}
}
