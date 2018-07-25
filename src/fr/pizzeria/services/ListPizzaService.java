package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;

public class ListPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner questionUser, IPizzaDao pizzaList) {
		System.out.println("Pizzas");
		
		//Display array
		System.out.println(pizzaList.toString());
	}

}
