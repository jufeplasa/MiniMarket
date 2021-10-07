package ui;

import java.util.Scanner;

import model.MiniMarket;

import java.time.LocalDate;

public class Main {
	public static Scanner sc=new Scanner(System.in);
	private static MiniMarket market;
	public static void main(String[] args) {
		int day=LocalDate.now().getDayOfMonth();
		boolean conti=true;
		while(conti) {
			int choose=showMenu();
			switch(choose) {
			case 1:
				System.out.println("Enter the type of document: ");
				String type=sc.next();
				System.out.println("Enter number of document: ");
				String id=sc.next();
				market.addClient(type, id, day);
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
