package fr.pizzeria.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import fr.pizzeria.utils.ToString;
import fr.pizzeria.utils.StringUtils;

/**
 * A pizza class which implement id, code, wording and price
 * @author Antony
 *
 */
public class Pizza {
	private static int idCounter = 0;
	public int id;
	@ToString(separator=" -> ", uppercase=true)
	public String code;
	@ToString(separator=" ")
	public String wording;
	@ToString(separator=" - ", isPrice=true)
	public double price;
	@ToString
	public PizzaType pizzaType;
	
	public Pizza(String code, String wording, double price, PizzaType pizzaType){
		this.id = idCounter;
		idCounter++;
		
		this.code = code;
		this.wording = wording;
		this.price = price;
		
		this.pizzaType = pizzaType;
	}
	
	public Pizza(int id, String code, String wording, double price, PizzaType pizzaType){
		this.id = id;
		this.code = code;
		this.wording = wording;
		this.price = price;
		
		this.pizzaType = pizzaType;
	}
	
	@Override
	public String toString(){
		return StringUtils.getStringFromAnnotationToString(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getWording() {
		return wording;
	}

	public void setWording(String wording) {
		this.wording = wording;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public PizzaType getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(PizzaType pizzaType) {
		this.pizzaType = pizzaType;
	}
	
	
}
