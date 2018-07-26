package fr.pizzeria.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
/**
 * If a field is annotated with this annotation type, this field's value
 * can be returned into String, see {@link fr.pizzeria.utils.StringUtils}
 * @author Antony
 *
 */
public @interface ToString {
	boolean uppercase() default false;
	boolean isPrice() default false;
 	String separator() default "";
}
