package ua.logos.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@Constraint(validatedBy = PasswordValidator.class)
public @interface Password {
	String message() default "Typed passwords aren't the same";
	Class<?>[] groups() default{};
	Class<? extends Payload>[] payload() default {};
}
