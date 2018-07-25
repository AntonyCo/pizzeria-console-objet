package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMapDao;
import fr.pizzeria.dao.PizzaMemDao;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.services.AddPizzaService;
import fr.pizzeria.services.DeletePizzaService;
import fr.pizzeria.services.ListPizzaService;
import fr.pizzeria.services.MenuServiceFactory;
import fr.pizzeria.services.UpdatePizzaService;

public class PizzeriaAdminConsoleApp {
	
	public static void main(String[] args){
		int choiceNumber = 0;
		Scanner questionUser = new Scanner(System.in);
		//PizzaMemDao pizzaList = new PizzaMemDao();
		PizzaMapDao pizzaList = new PizzaMapDao();
		
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
			
			switch(choiceNumber){
				case 1:
					MenuServiceFactory.getService(choiceNumber).executeUC(questionUser, pizzaList);
					break;
				case 2:
					MenuServiceFactory.getService(choiceNumber).executeUC(questionUser, pizzaList);
					break;
				case 3:
					MenuServiceFactory.getService(choiceNumber).executeUC(questionUser, pizzaList);
					break;
				case 4:	
					MenuServiceFactory.getService(choiceNumber).executeUC(questionUser, pizzaList);
					break;
				case 99:
					System.out.println("Bye ☹ ");
					questionUser.close();
					break;
			}
		}
	}
}
