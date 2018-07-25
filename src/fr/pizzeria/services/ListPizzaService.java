package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaMemDao;

public class ListPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner questionUser, PizzaMemDao pizzaList) {
		System.out.println("Pizzas");
		
		//Display array
		System.out.println(pizzaList.toString());
	}

}
