package fr.pizzeria.exception;

public class MinimumException extends StockageException{
	  public MinimumException () {
		  super("Entered value is inferior or equal to minimum value required !");
	  } 
	  
	  public MinimumException (String msg) { 
	    super(msg); 
	  }
}
