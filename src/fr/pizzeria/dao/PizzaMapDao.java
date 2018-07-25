package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import fr.pizzeria.model.Pizza;
/**
 * Implement the container off {@link fr.pizzeria.model.Pizza} as a {@link java.util.HashMap}
 * @author Antony
 *
 */
public class PizzaMapDao implements IPizzaDao{
	private Map<String, Pizza> pizzaMap;
	
	public PizzaMapDao(){
		this.initializeMap();
	}
	@Override
	public List<Pizza> findAllPizzas() {
		return new ArrayList<Pizza>(pizzaMap.values());
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		pizzaMap.put(pizza.getCode(), pizza);
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		pizzaMap.remove(codePizza);
		this.saveNewPizza(pizza);
	}

	@Override
	public void deletePizza(String codePizza) {
		pizzaMap.remove(codePizza);
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		return pizzaMap.get(codePizza);
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		return pizzaMap.containsKey(codePizza);
	}
	
	private void initializeMap(){
		pizzaMap = new HashMap<String, Pizza>();
		
		pizzaMap.put("PEP", new Pizza("PEP", "Pépéroni", 12.50));
		pizzaMap.put("MAR", new Pizza("MAR", "Margherita", 14.00));
		pizzaMap.put("REIN", new Pizza("REIN", "La Reine", 11.50));
		pizzaMap.put("FRO", new Pizza("FRO", "La 4 fromages", 12.00));
		pizzaMap.put("CAN", new Pizza("CAN", "La cannibale", 12.50));
		pizzaMap.put("SAV", new Pizza("SAV", "La savoyarde", 13.00));
		pizzaMap.put("ORI", new Pizza("ORI", "L'orientale", 13.50));
		pizzaMap.put("IND", new Pizza("IND", "L'indienne", 14.00));
	}
	
	@Override
	public String toString(){
		String str ="";
		Iterator<Pizza> valuesIte = pizzaMap.values().iterator();
		while (valuesIte.hasNext()) {
			Pizza p = valuesIte.next();
			str += p.getCode()+" -> "+p.getWording()+" ("+p.getPrice()+" €)\n";
		}
		return str;
	}

}
