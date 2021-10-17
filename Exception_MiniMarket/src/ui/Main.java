package ui;

import java.util.Scanner;

import exceptions.NotCorrespondingDayException;
import exceptions.YoungerException;
import model.MiniMarket;

import java.time.LocalDate;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static MiniMarket market;
	public static void main(String[] args) {
		market=new MiniMarket();
		int day=LocalDate.now().getDayOfMonth();
		boolean conti=true;
		while(conti) {
			int choose=showMenu();
			switch(choose) {

			case 1:
				System.out.println("Enter the type of document (TI, CC, PP, CE): ");
				String type=sc.next();
				System.out.println("Enter number of document: ");
				String id=sc.next();

					try {
						market.addClient(type, id, day);
						System.out.println("The person with document "+type+" with number "+id+" has enter in the mini market");
					} 
					catch (YoungerException e) {
						System.out.println("the market not allow younger people");
						e.printStackTrace();
					}
					catch(NotCorrespondingDayException ncd) {

						System.out.println("Your penultimate number of your ID it's not matches with today");
						ncd.printStackTrace();
					}
				
				
				break;

			case 2:
				System.out.println(market.getTries()+" tried to enter in the mini market");
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
