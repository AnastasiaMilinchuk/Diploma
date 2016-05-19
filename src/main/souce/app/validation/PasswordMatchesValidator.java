package app.validation;

import app.entities.userdata.UserData;
import app.validation.annotations.PasswordMatches;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by click on 5/18/2016.
 */
public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {
    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }
    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context){
        UserData user = (UserData) obj;
        return user.getPassword().equals(user.getMatchingPassword());
    }
}

