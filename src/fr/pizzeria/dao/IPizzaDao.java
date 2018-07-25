package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

/**
 * This interface describe a container of {@link fr.pizzeria.model.Pizza}
 * @author Antony
 *
 */
public interface IPizzaDao {
	
	/**
	 * 
	 * @return an array of pizza
	 */
	 Pizza[] findAllPizzas();
	 
	 /**
	  * Add a new pizza in parameter to local array.
	  * @param pizza to add
	  */
	 void saveNewPizza(Pizza pizza);
	 
	 /**
	  * Update the pizza selected by codePizza in the local array.
	  * @param codePizza code to find pizza to update
	  * @param pizza new value off pizza
	  */
	 void updatePizza(String codePizza, Pizza pizza);
	 
	 /**
	  * Delete the pizza selected by codePizza in the local array.
	  * @param codePizza code to find pizza to delete
	  */
	 void deletePizza(String codePizza);
	 
	 /**
	  * Return a pizza found by codePizza.
	  * @param codePizza code to find the pizza.
	  * @return Pizza
	  */
	 Pizza findPizzaByCode(String codePizza);
	 
	 /**
	  * Boolean to test if the pizza exist in the local array.
	  * @param codePizza code to find the pizza in local array
	  * @return true if the pizza exist in local array
	  */
	 boolean pizzaExists(String codePizza);
}
