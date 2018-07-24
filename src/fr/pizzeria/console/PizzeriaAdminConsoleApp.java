package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;
import sun.reflect.generics.scope.DummyScope;

public class PizzeriaAdminConsoleApp {
	public static void main(String[] args){
		int choiceNumber = 0;
		Scanner questionUser = new Scanner(System.in);
		Pizza[] pizzaArray = new Pizza[8];
		String code, wording;
		double price;
		
		//Add basics pizzas to array
		pizzaArray[0] = new Pizza("PEP", "Pépéroni", 12.50);
		pizzaArray[1] = new Pizza("MAR", "Margherita", 14.00);
		pizzaArray[2] = new Pizza("REIN", "La Reine", 11.50);
		pizzaArray[3] = new Pizza("FRO", "La 4 fromages", 12.00);
		pizzaArray[4] = new Pizza("CAN", "La cannibale", 12.50);
		pizzaArray[5] = new Pizza("SAV", "La savoyarde", 13.00);
		pizzaArray[6] = new Pizza("ORI", "L'orientale", 13.50);
		pizzaArray[7] = new Pizza("IND", "L'indienne", 14.00);
		
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
					displayArray(pizzaArray);
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
					price = questionUser.nextDouble();
					//Create the new pizza by informations
					Pizza newPizza = new Pizza(code, wording, price);
					pizzaArray = addPizzaToArray(pizzaArray, newPizza);
					break;
				case 3:
					System.out.println("Update a pizza");
					displayArray(pizzaArray);
					System.out.println("Please enter pizza code to update :");
					code = questionUser.next();
					int indexToUpdate = 0;
					//Looking for the pizza to update
					for (int i=0; i<pizzaArray.length; i++){
						if(code.equals(pizzaArray[i].code)){
							indexToUpdate = i;
						}
					}
					//Retrieve informations from user
					System.out.println("Please enter the code :");
					code = questionUser.next();
					System.out.println("Please enter the wording :");
					wording = questionUser.next();
					System.out.println("Please enter the price :");
					price = questionUser.nextDouble();
					//Create the new pizza by informations
					newPizza = new Pizza(code, wording, price);
					pizzaArray[indexToUpdate] = newPizza;
					break;
				case 4:
					System.out.println("Delete a pizza");
					displayArray(pizzaArray);
					System.out.println("Please enter pizza code to delete :");
					code = questionUser.next();
					//Create a temporary array with size 0.
					Pizza[] tempPizzaArray = new Pizza[0];
					System.out.println("DEBUG "+tempPizzaArray.length);
					for(int i=0; i<pizzaArray.length; i++){
						//If it's not the pizza to delete, add the pizza to temporary array
						if(!code.equals(pizzaArray[i].code)){
							tempPizzaArray = addPizzaToArray(tempPizzaArray, pizzaArray[i]);
						}
					}
					//Pizza array take value from temporary array
					pizzaArray = tempPizzaArray;
					System.out.println("DEBUG1 "+pizzaArray.length);
					break;
				case 99:
					System.out.println("Bye ☹ ");
					break;
			}
		}
	}
	
	public static void displayArray(Pizza[] pizzaArray){
		for(int i=0; i<pizzaArray.length; i++){
			System.out.println(pizzaArray[i].code+" -> "+pizzaArray[i].wording+" ("+pizzaArray[i].price+" €)");
		}
		System.out.println();
	}
	
	public static Pizza[] addPizzaToArray(Pizza[] pizzaArray, Pizza pizza){
		Pizza[] tempPizzaArray = new Pizza[pizzaArray.length+1];
		//Copy old array to the new array
		for(int i=0; i<pizzaArray.length; i++){
			tempPizzaArray[i] = pizzaArray[i];
		}
		//Add the pizza to the last position
		tempPizzaArray[tempPizzaArray.length-1] = pizza;
		
		return tempPizzaArray;
	}
}
