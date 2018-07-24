package fr.pizzeria.model;

public class Pizza {
	public static int idCounter = 0;
	public int id;
	public String code;
	public String wording;
	public double price;
	
	public Pizza(String code, String wording, double price){
		this.id = idCounter;
		idCounter++;
		
		this.code = code;
		this.wording = wording;
		this.price = price;
	}
	
	public Pizza(int id, String code, String wording, double price){
		this.id = id;
		this.code = code;
		this.wording = wording;
		this.price = price;
	}
}
