package az.rock.auth.domain.presentation.validation.annotation;

import az.rock.auth.domain.presentation.validation.concretes.EmailValidator;
import az.rock.auth.domain.presentation.validation.concretes.PatternValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PatternValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface GPattern {
    String message() default "Invalid phone number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    String pattern() default "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d@$!%*#?&]{8,}$";
}
