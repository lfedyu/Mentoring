import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsStringContainsValidator implements ConstraintValidator<IsStringContains, String> {

    private String name;

    public void initialize(IsStringContains isStringContains) {
        this.name = isStringContains.text();
    }
    public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {
        if ( str == null ) {
            return true;
        }
        return str.equals(name);
    }
}
