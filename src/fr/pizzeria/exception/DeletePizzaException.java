package fr.pizzeria.exception;

public class DeletePizzaException extends StockageException{
	  public DeletePizzaException() {
		  super("Unable to delete cause Pizza doesn't exist !");
	  } 
	  
	  public DeletePizzaException(String msg) { 
		  super(msg); 
	  }
}
