package uz.bakhromjon.common;


import jakarta.validation.*;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class SelfValidator<T> {
    public void validate(T obj, Class<?> group) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> violations = validator.validate(obj, group);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }

    public void validate(T obj) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> violations = validator.validate(obj);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }
}
