package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.DeletePizzaException;

public class DeletePizzaService extends MenuService{

	@Override
	public void executeUC(Scanner questionUser, IPizzaDao pizzaList) throws DeletePizzaException{
		String codePizza;
		
		System.out.println("Delete a pizza");
		System.out.println(pizzaList.toString());
		
		//Retrieve information from user
		System.out.println("Please enter pizza code to delete :");
		codePizza = questionUser.next();
		
		//Delete the pizza
		if(!pizzaList.pizzaExists(codePizza)){
			throw new DeletePizzaException();
		}
		pizzaList.deletePizza(codePizza);
	}

}
