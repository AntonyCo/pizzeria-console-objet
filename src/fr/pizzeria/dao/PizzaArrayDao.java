package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

public class PizzaArrayDao implements IPizzaDao{
	private Pizza[] pizzaArray;
	
	public PizzaArrayDao() {
		this.initializePizzaArray();
	}
	
	@Override
	public Pizza[] findAllPizzas() {
		return pizzaArray;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		Pizza[] tempPizzaArray = new Pizza[pizzaArray.length+1];
		
		//Copy old array to the new array
		for(int i=0; i<pizzaArray.length; i++){
			tempPizzaArray[i] = pizzaArray[i];
		}
		
		//Add the pizza to the last position
		tempPizzaArray[tempPizzaArray.length-1] = pizza;
		this.setPizzaArray(tempPizzaArray);
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		this.findPizzaByCode(codePizza).setWording(pizza.getWording());
		this.findPizzaByCode(codePizza).setPrice(pizza.getPrice());
		
		this.findPizzaByCode(codePizza).setCode(pizza.getCode());
	}

	@Override 
	public void deletePizza(String codePizza) {
		int counter = 0;
		//temporary array length will be equal to length of pizza array without deleted element
		Pizza[] tempPizzaArray = new Pizza[this.getPizzaArray().length -1];
		
		for(int i=0; i<pizzaArray.length; i++){
			//Add the element to temporary array at position of counter
			if(!codePizza.equals(pizzaArray[i].getCode())){
				tempPizzaArray[counter] = pizzaArray[i];
				counter++;
			}
		}
		//Pizza array take value of new array without deleted pizza
		this.setPizzaArray(tempPizzaArray);
	}
	@Override
	public Pizza findPizzaByCode(String codePizza) {
		for(int i=0; i<pizzaArray.length; i++){
			if(codePizza.equals(pizzaArray[i].getCode())){
				return pizzaArray[i];
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
		for(int i=0; i<getPizzaArray().length; i++){
			str += this.getPizzaArray()[i].getCode()+" -> "+this.getPizzaArray()[i].getWording()+" ("+this.getPizzaArray()[i].getPrice()+" €)\n";
		}
		return str;
	}
	private void initializePizzaArray(){
		//Add basics pizzas to array
		pizzaArray = new Pizza[8];
		
		pizzaArray[0] = new Pizza("PEP", "Pépéroni", 12.50);
		pizzaArray[1] = new Pizza("MAR", "Margherita", 14.00);
		pizzaArray[2] = new Pizza("REIN", "La Reine", 11.50);
		pizzaArray[3] = new Pizza("FRO", "La 4 fromages", 12.00);
		pizzaArray[4] = new Pizza("CAN", "La cannibale", 12.50);
		pizzaArray[5] = new Pizza("SAV", "La savoyarde", 13.00);
		pizzaArray[6] = new Pizza("ORI", "L'orientale", 13.50);
		pizzaArray[7] = new Pizza("IND", "L'indienne", 14.00);
	}
	
	public Pizza[] getPizzaArray() {return pizzaArray;}
	public void setPizzaArray(Pizza[] pizzaArray) {this.pizzaArray = pizzaArray;}
}
