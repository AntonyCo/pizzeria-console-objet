package fr.pizzeria.services;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaArrayDao;

public abstract class MenuService {

	public abstract void executeUC(Scanner questionUser, PizzaArrayDao pizzaArray);
}
