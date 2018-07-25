package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.model.Pizza;

public class AddPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner questionUser, IPizzaDao pizzaList) throws SavePizzaException{
		String code, wording;
		double price;
		
		System.out.println("Add a new pizza");	
		
		//Retrieve informations from user
		System.out.println("Please enter the code :");
		code = questionUser.next();
		
		//Exception if pizza already exist
		if(pizzaList.pizzaExists(code)){
			throw new SavePizzaException();
		}
		
		System.out.println("Please enter the wording :");
		wording = questionUser.next();
		System.out.println("Please enter the price :");
		price = Double.parseDouble(questionUser.next());
		
		//Create the new pizza by informations
		Pizza newPizza = new Pizza(code, wording, price);
		pizzaList.saveNewPizza(newPizza);
	}

}
