package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {
	public static void main(String[] args){
		int choiceNumber = 0;
		Scanner questionUser = new Scanner(System.in);
		
		
		while(choiceNumber != 99){
			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Display pizzas");
			System.out.println("2. Add new pizza");
			System.out.println("3. Update pizza");
			System.out.println("4. Delete pizza");
			System.out.println("99. Exit");
			
			choiceNumber = questionUser.nextInt();
			
			switch(choiceNumber){
				case 1:
					System.out.println("Pizzas");
					break;
				case 2:
					System.out.println("Add a new pizza");
					break;
				case 3:
					System.out.println("Update a pizza");
					break;
				case 4:
					System.out.println("Delete a pizza");
				case 99:
					System.out.println("Bye ☹ ");
					break;
			}
		}
	}
}
