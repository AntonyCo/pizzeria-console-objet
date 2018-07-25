package fr.pizzeria.services;

public class MenuServiceFactory {
	
	/**
	 * Start a service according to the value of 'value':
	 * 	value = 1: Display all the pizzas
	 * 	value = 2: Add a new pizza
	 * 	value = 3: Update a pizza
	 * 	value = 4: Delete a pizza
	 * @param value is an Integer to select service
	 * @return Return a class according to selected service
	 */
	public static MenuService getService(int value){
		MenuService choice = null;
		
		switch(value){
			case 1:
				choice = new ListPizzaService();
				break;
			case 2:
				choice = new AddPizzaService();
				break;
			case 3:
				choice = new UpdatePizzaService();
				break;
			case 4:	
				choice = new DeletePizzaService();
				break;
			case 99:
				System.out.println("Bye ☹ ");
				System.exit(-1);
				break;
		}
		return choice;
	}
}
