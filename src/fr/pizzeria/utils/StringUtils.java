package fr.pizzeria.utils;

import java.lang.reflect.Field;
/**
 * A class that implement some utilities methods with String
 * @author Antony
 *
 */
public class StringUtils {

/**
 * 	This method browse an array of Fields, and return into a String
 * 	each value of Field annotated by {@link fr.pizzeria.utils.ToString}
 * @param obj 
 * @return a String create with Annotation {@link fr.pizzeria.utils.ToString}
 */
	public static String getStringFromAnnotationToString(Object obj){
		String str ="";
		String tempStr="";
		//Browse all fields of Pizza class
		for(Field f : obj.getClass().getDeclaredFields()){
			//If the field have TosTring annotation
			if (f.isAnnotationPresent(ToString.class)){
				ToString annot = f.getAnnotation(ToString.class);
				try {
					tempStr = f.get(obj).toString();
					if(annot.uppercase()){
						tempStr = tempStr.toUpperCase();
					}
					if(annot.isPrice()){
						tempStr ="("+tempStr+" €)";
					}
					str+= tempStr+annot.separator();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		return str;
	}
}
