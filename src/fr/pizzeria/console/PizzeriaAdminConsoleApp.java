package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaArrayDao;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.services.AddPizzaService;
import fr.pizzeria.services.DeletePizzaService;
import fr.pizzeria.services.ListPizzaService;
import fr.pizzeria.services.UpdatePizzaService;

public class PizzeriaAdminConsoleApp {
	
	public static void main(String[] args){
		int choiceNumber = 0;
		Scanner questionUser = new Scanner(System.in);
		PizzaArrayDao pizzaArray = new PizzaArrayDao();
		
		//Menu initialization
		while(choiceNumber != 99){
			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Display pizzas");
			System.out.println("2. Add new pizza");
			System.out.println("3. Update pizza");
			System.out.println("4. Delete pizza");
			System.out.println("99. Exit");
			
			choiceNumber = questionUser.nextInt();
			
			switch(choiceNumber){
				//Case 1: Display all pizzas
				case 1:
					
					//TESTER AVEC MENUSERVICE
					ListPizzaService listPizza = new ListPizzaService();
					listPizza.executeUC(questionUser, pizzaArray);
					break;
				case 2:
					AddPizzaService addPizza = new AddPizzaService();
					addPizza.executeUC(questionUser, pizzaArray);
					break;
				case 3:
					UpdatePizzaService updatePizza = new UpdatePizzaService();
					updatePizza.executeUC(questionUser, pizzaArray);
					break;
				case 4:	
					DeletePizzaService deletePizza = new DeletePizzaService();
					deletePizza.executeUC(questionUser, pizzaArray);
					break;
				case 99:
					System.out.println("Bye ☹ ");
					questionUser.close();
					break;
			}
		}
	}
}
