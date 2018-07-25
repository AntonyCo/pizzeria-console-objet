package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

public class UpdatePizzaService extends MenuService{

	@Override
	public void executeUC(Scanner questionUser, IPizzaDao pizzaList) {
		String codePizza, code, wording;
		double price;
		Pizza newPizza;
		
		System.out.println("Update a pizza");
		System.out.println(pizzaList.toString());
		
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
		pizzaList.updatePizza(codePizza, newPizza);
	}

}
