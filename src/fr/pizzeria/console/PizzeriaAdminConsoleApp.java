package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaArrayDao;
import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {
	
	public static void main(String[] args){
		
		int choiceNumber = 0;
		Scanner questionUser = new Scanner(System.in);
		PizzaArrayDao pizzaArray = new PizzaArrayDao();
		String code, codePizza, wording;
		double price;
		
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
					System.out.println("Pizzas");
					System.out.println(pizzaArray.toString());
					break;
				//Case 2: Add a new pizza by code, wording and price
				case 2:
					System.out.println("Add a new pizza");	
					
					//Retrieve informations from user
					System.out.println("Please enter the code :");
					code = questionUser.next();
					System.out.println("Please enter the wording :");
					wording = questionUser.next();
					System.out.println("Please enter the price :");
					price = Double.parseDouble(questionUser.next());
					
					//Create the new pizza by informations
					Pizza newPizza = new Pizza(code, wording, price);

					//Add the new pizza
					pizzaArray.saveNewPizza(newPizza);
					break;
				case 3:
					System.out.println("Update a pizza");
					System.out.println(pizzaArray.toString());
					
					//Retrieve information from user
					System.out.println("Please enter pizza code to update :");
					codePizza = questionUser.next();
					

					//Retrieve informations from user
					System.out.println("Please enter the new code :");
					code = questionUser.next();
					System.out.println("Please enter the new wording :");
					wording = questionUser.next();
					System.out.println("Please enter the new price :");
					price = Double.parseDouble(questionUser.next());
					
					//Update the pizza
					newPizza = new Pizza(code, wording, price);
					pizzaArray.updatePizza(codePizza, newPizza);
					break;
				case 4:
					
					System.out.println("Delete a pizza");
					System.out.println(pizzaArray.toString());
					
					//Retrieve information from user
					System.out.println("Please enter pizza code to delete :");
					codePizza = questionUser.next();
					
					pizzaArray.deletePizza(codePizza);
					break;
				case 99:
					System.out.println("Bye ☹ ");
					questionUser.close();
					break;
			}
		}
	}
}
