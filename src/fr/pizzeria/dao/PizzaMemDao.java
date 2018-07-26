package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.model.Pizza;
import fr.pizzeria.model.PizzaType;
/**
 *  Implement a container of {@link fr.pizzeria.model.Pizza} with a {@link java.util.ArrayList}
 * @author Antony
 *
 */
public class PizzaMemDao implements IPizzaDao{
	private List<Pizza> pizzaList;
	
	public PizzaMemDao() {
		this.initializePizzaList();
	}
	
	@Override
	public List<Pizza> findAllPizzas() {
		return pizzaList;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		pizzaList.add(pizza);
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		Pizza old = this.findPizzaByCode(codePizza);
		
		old.setWording(pizza.getWording());
		old.setPrice(pizza.getPrice());
		old.setCode(pizza.getCode());
		old.setPizzaType(pizza.getPizzaType());
	}

	@Override 
	public void deletePizza(String codePizza) {
		Pizza pizza = this.findPizzaByCode(codePizza);
		pizzaList.remove(pizza);
	}
	
	@Override
	public Pizza findPizzaByCode(String codePizza) {
		for(Pizza p : pizzaList){
			if(p.getCode().equals(codePizza)){
				return p;
			}
		}
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		if(findPizzaByCode(codePizza) != null){
			return true;
		}
		return false;
	}

	@Override
	public String toString(){
		String str ="";
		for(Pizza p : pizzaList){
			str += p.getCode()+" -> "+p.getWording()+" ("+p.getPrice()+" €) - "+p.toString()+"\n";
		}
		return str;
	}
	
	private void initializePizzaList(){
		pizzaList = new ArrayList<Pizza>();
		
		pizzaList.add(new Pizza("PEP", "Pépéroni", 12.50, PizzaType.MEAT));
		pizzaList.add(new Pizza("MAR", "Margherita", 14.00, PizzaType.WITHOUT_MEAT));
		pizzaList.add(new Pizza("REIN", "La Reine", 11.50, PizzaType.MEAT));
		pizzaList.add(new Pizza("FRO", "La 4 fromages", 12.00, PizzaType.WITHOUT_MEAT));
		pizzaList.add(new Pizza("CAN", "La cannibale", 12.50, PizzaType.MEAT));
		pizzaList.add(new Pizza("SAV", "La savoyarde", 13.00, PizzaType.WITHOUT_MEAT));
		pizzaList.add(new Pizza("ORI", "L'orientale", 13.50, PizzaType.FISH));
		pizzaList.add(new Pizza("IND", "L'indienne", 14.00, PizzaType.FISH));
	}
	
	public List<Pizza> getPizzaList() {return pizzaList;}
	public void setPizzaList(List<Pizza> pizzaArray) {this.pizzaList = pizzaArray;}
}
