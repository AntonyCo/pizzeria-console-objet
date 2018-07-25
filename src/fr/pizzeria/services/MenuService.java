package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaArrayDao;

public abstract class MenuService {
	
	/**
	 * 
	 * @param questionUser is a Scanner to retrieve informations from user
	 * @param pizzaArray is a container of Pizza
	 */
	public abstract void executeUC(Scanner questionUser, PizzaArrayDao pizzaArray);
}
