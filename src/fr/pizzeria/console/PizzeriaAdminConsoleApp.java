package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaMapDao;
import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.services.MenuServiceFactory;

public class PizzeriaAdminConsoleApp {
	
	public static void main(String[] args){
		int choiceNumber = 0;
		Scanner questionUser = new Scanner(System.in);
		IPizzaDao pizzaList = null;
		
		while(choiceNumber != 1 && choiceNumber != 2){
			System.out.println("----- Which structure do you want to use ? -----");
			System.out.println("1. List");
			System.out.println("2. Map");
			choiceNumber = questionUser.nextInt();
			switch(choiceNumber){
				case 1:
					pizzaList = new PizzaMemDao();
					break;
				case 2:
					pizzaList = new PizzaMapDao();
					break;
				default:
					System.out.println("Please enter a correct value !\n");
					break;
			}
		}

		while(choiceNumber != 99){
			
			//Display menu
			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Display pizzas");
			System.out.println("2. Add new pizza");
			System.out.println("3. Update pizza");
			System.out.println("4. Delete pizza");
			System.out.println("99. Exit");
			
			//Retrieve user choice
			choiceNumber = questionUser.nextInt();
			try {
				MenuServiceFactory.getService(choiceNumber).executeUC(questionUser, pizzaList);
			} catch (StockageException e) {
				e.printStackTrace();
			}
		}
	}
}
