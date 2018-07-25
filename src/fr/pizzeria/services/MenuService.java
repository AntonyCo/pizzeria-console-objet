package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;

public abstract class MenuService {
	
	/**
	 * 
	 * @param questionUser is a Scanner to retrieve informations from user
	 * @param pizzaList is a container of Pizza
	 */
	public abstract void executeUC(Scanner questionUser, IPizzaDao pizzaList);
}
