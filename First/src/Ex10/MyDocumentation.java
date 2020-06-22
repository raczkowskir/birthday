package Ex10;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({TYPE, METHOD})
public @interface MyDocumentation {
	public String author() default "Raki";
	public String comment();
}