package fr.pizzeria.model;

public enum PizzaType {

	MEAT("Meat"),
	FISH("Fish"),
	WITHOUT_MEAT("Without Meat");
	
	private String name;
	
	private PizzaType(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
