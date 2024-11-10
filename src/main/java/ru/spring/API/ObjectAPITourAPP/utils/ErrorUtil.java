package ru.spring.API.ObjectAPITourAPP.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import ru.spring.API.ObjectAPITourAPP.exceptions.ObjectNotExist;

import java.util.List;

public class ErrorUtil {

    public static void returnError(BindingResult bindingResult) {

        StringBuilder errorMsg = new StringBuilder();

        List<FieldError> errorList = bindingResult.getFieldErrors();

        for (FieldError error : errorList) {
            errorMsg.append(error.getField())
                    .append(" — ")
                    .append(error.getDefaultMessage())
                    .append("; ");
        }

        throw new ObjectNotExist(errorMsg.toString());
    }
}
