package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaArrayDao;

public class DeletePizzaService extends MenuService{

	@Override
	public void executeUC(Scanner questionUser, PizzaArrayDao pizzaArray) {
		String codePizza;
		
		System.out.println("Delete a pizza");
		System.out.println(pizzaArray.toString());
		
		//Retrieve information from user
		System.out.println("Please enter pizza code to delete :");
		codePizza = questionUser.next();
		
		//Delete the pizza
		pizzaArray.deletePizza(codePizza);
	}

}
