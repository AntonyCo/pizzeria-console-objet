package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.model.PizzaType;
/**
 * Service layer to add a new Pizza
 * @author Antony
 *
 */
public class AddPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner questionUser, IPizzaDao pizzaList) throws SavePizzaException{
		String code, wording;
		PizzaType pizzaType;
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
		
		//Create the new pizza by informations
		Pizza newPizza = new Pizza(code, wording, price, pizzaType);
		pizzaList.saveNewPizza(newPizza);
	}

}
