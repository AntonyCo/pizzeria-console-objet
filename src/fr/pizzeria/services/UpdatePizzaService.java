package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.model.PizzaType;

/**
 * 	Service layer to update a pizza
 * @author Antony
 *
 */
public class UpdatePizzaService extends MenuService{

	@Override
	public void executeUC(Scanner questionUser, IPizzaDao pizzaList) throws UpdatePizzaException{
		String codePizza, code, wording;
		PizzaType pizzaType;
		double price;
		Pizza newPizza;
		
		System.out.println("Update a pizza");
		System.out.println(pizzaList.toString());
		
		//Retrieve information from user
		System.out.println("Please enter pizza code to update :");
		codePizza = questionUser.next();
		
		if(!pizzaList.pizzaExists(codePizza)){
			throw new UpdatePizzaException();
		}
		//Retrieve informations from user
		System.out.println("Please enter the new code :");
		code = questionUser.next();
		System.out.println("Please enter the new wording :");
		wording = questionUser.next();
		System.out.println("Please enter the new price :");
		price = Double.parseDouble(questionUser.next());
		
		//Retrieve the type of pizza
		int counter =0;
		PizzaType[] arrayPizzaType = PizzaType.values();
		System.out.println("Please select the type of Pizza :");
		for(PizzaType p: arrayPizzaType){
			System.out.println(counter+". "+p.getName());
			counter++;
		}
		counter = questionUser.nextInt();
		pizzaType = arrayPizzaType[counter];
		
		//Update the pizza
		newPizza = new Pizza(code, wording, price, pizzaType);
		pizzaList.updatePizza(codePizza, newPizza);
	}

}
