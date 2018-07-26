package fr.pizzeria.utils;

import java.lang.reflect.Field;

import fr.pizzeria.exception.MinimumException;

public class Validator {

	public static void respectRules(Object obj) throws MinimumException{
		//Browse all fields of Object
		for(Field f : obj.getClass().getDeclaredFields()){
			//If the field have Rule annotation
			if (f.isAnnotationPresent(Rule.class)){
				Rule annot = f.getAnnotation(Rule.class);
				try {
					if(f.getDouble(obj) <= annot.min()){
						throw new MinimumException();
					}
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
