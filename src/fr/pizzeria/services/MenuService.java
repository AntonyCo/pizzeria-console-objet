package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.StockageException;

public abstract class MenuService {
	
	/**
	 * 
	 * @param questionUser is a Scanner to retrieve informations from user
	 * @param pizzaList is a container of Pizza
	 * @throws StockageException
	 */	
	public abstract void executeUC(Scanner questionUser, IPizzaDao pizzaList) throws StockageException;
}
