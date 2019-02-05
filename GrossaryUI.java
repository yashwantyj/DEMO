package yash.CAB;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GrossaryUI {
	public static void main(String[] args) {
		System.out.println("############WELCOME to RIDE ON CAB SERVICES###############");
		System.out.println("");
		while (true) {
			System.out.println("-------------MENU--------------");
			System.out.println("1. Buy Grossary \n" + "2. Read Grossary\n" + "3. Exit.");
			System.out.println("Enter Your choice:-");
			Scanner sc = new Scanner(System.in);
			int op = sc.nextInt();
			switch (op) {
			case 1:
				try {
					System.out.println("Enter Grossary  Name:");
					String name = sc.next();
					GrossaryValidator.validateGrossaryName(name);
					System.out.println("Enter Type:");
					String type = sc.next();
					GrossaryValidator.validateGrossaryType(type);
					System.out.println("Enter Quntity");
					int qunt = sc.nextInt();
					GrossaryValidator.validateGrossaryQuntity("" + qunt);
					int refId = new Random().nextInt(10000);// Random number for ref ID
					GrossaryDetails GD = new GrossaryDetails(refId, name, qunt, type);
					new GrossaryHelper().addGrossary(GD);
					System.out.println("-------------Done--------------");

				} catch (GrossaryException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			case 2:
				new GrossaryHelper().readGrossary();

				break;
			case 3:
				System.out.println("Thank you shop with us");
				System.exit(0);
				break;
			}

		}
	}
}
