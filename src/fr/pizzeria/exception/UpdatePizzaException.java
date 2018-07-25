package fr.pizzeria.exception;

public class UpdatePizzaException extends StockageException{
	public UpdatePizzaException(){
		super("Unable to update cause Pizza doesn't exist !");
	}
	
	public UpdatePizzaException(String msg){
		super(msg);
	}
}
