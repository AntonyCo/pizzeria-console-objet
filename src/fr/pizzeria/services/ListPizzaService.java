package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaArrayDao;

public class ListPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner questionUser, PizzaArrayDao pizzaArray) {
		System.out.println("Pizzas");
		
		//Display array
		System.out.println(pizzaArray.toString());
	}

}
