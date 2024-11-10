package ru.spring.API.ObjectAPITourAPP.validators;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.spring.API.ObjectAPITourAPP.models.MapObject;
import ru.spring.API.ObjectAPITourAPP.services.ObjectService;

@RequiredArgsConstructor
public class ObjectValidator implements Validator {

    private final ObjectService objectService;

    @Override
    public boolean supports(Class<?> clazz) {
        return MapObject.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        MapObject mapObject = (MapObject) target;

    }
}
