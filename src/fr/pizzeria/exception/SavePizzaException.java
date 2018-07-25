package fr.pizzeria.exception;

public class SavePizzaException extends StockageException{
	public SavePizzaException(){
		super("Unable to add cause Pizza already exist !");
	}
	
	public SavePizzaException(String msg){
		super(msg);
	}
}
