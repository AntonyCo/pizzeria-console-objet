package fr.pizzeria.dao;

import java.util.List;

import fr.pizzeria.model.Pizza;

/**
 * This interface describe a container of {@link fr.pizzeria.model.Pizza}
 * @author Antony
 *
 */
public interface IPizzaDao {
	
	/**
	 * 
	 * @return a List of pizza
	 */
	 List<Pizza> findAllPizzas();
	 
	 /**
	  * Add a new pizza in parameter to container.
	  * @param pizza to add
	  */
	 void saveNewPizza(Pizza pizza);
	 
	 /**
	  * Update the pizza selected by codePizza in the container.
	  * @param codePizza code to find pizza to update
	  * @param pizza new value off pizza
	  */
	 void updatePizza(String codePizza, Pizza pizza);
	 
	 /**
	  * Delete the pizza selected by codePizza in the container.
	  * @param codePizza code to find pizza to delete
	  */
	 void deletePizza(String codePizza);
	 
	 /**
	  * Return a pizza found by codePizza from the container.
	  * @param codePizza code to find the pizza.
	  * @return Pizza
	  */
	 Pizza findPizzaByCode(String codePizza);
	 
	 /**
	  * Boolean to test if the pizza exist in the container.
	  * @param codePizza code to find the pizza in the container
	  * @return true if the pizza exist in the container
	  */
	 boolean pizzaExists(String codePizza);
}
