package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaArrayDao;
import fr.pizzeria.model.Pizza;

public class AddPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner questionUser, PizzaArrayDao pizzaArray) {
		String code, wording;
		double price;
		
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
	}

}
