package com;

import java.util.List;
import java.util.Scanner;

public class DigitalcomProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			boolean flag = true;

			while (flag) {
				System.out.println("Main Menu - Choices\r\n"

						+ "1) RegisterUser\r\n" + "2) ViewGames\r\n" + "3) searchByName\r\n" + "4) Exit");
				int input = sc.nextInt();
				if (input == 1) {
					System.out.println("Enter your Username");
					String name = sc.next();
					System.out.println("Enter your upassword");
					String password = sc.next();
					UserService us = new UserService();
					us.addUser(name, password);
				} else if (input == 2) {
					GameService gs = new GameService();
					List<Game> games = gs.viewAll();

//					for (Game game : games) {
//						System.out.println("Game=" + game.getGameName() + "\t Author=" + game.getAuthorName()
//								+ "\t Price=" + game.getPrice());
//					}
					games.forEach(System.out::println);
				} else if (input == 3) {
					GameService gs = new GameService();
					System.out.println("Enter author Name");
					String authorInput = sc.next();
					String author = gs.authorSearch(authorInput);
					if (author != null)
						System.out.println(author);

				} else if (input == 4)
					flag=false;
				else
					System.out.println("Invalid Input");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
