package fr.pizzeria.model;

/**
 * A pizza class which implement id, code, wording and price
 * @author Antony
 *
 */
public class Pizza {
	private static int idCounter = 0;
	private int id;
	private String code;
	private String wording;
	private double price;
	private PizzaType pizzaType;
	
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
		String str = pizzaType.getName();
		return str;
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
