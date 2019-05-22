import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private static Validator validator;

    @BeforeClass
    public static void setUpValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void test() {
        Person person = new Person(1, "Liliya", 22);
        Person person2 = new Person(2, "sometext", 100);

        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);
        assertEquals(1, constraintViolations.size());

        constraintViolations = validator.validate(person2);
        assertEquals(0, constraintViolations.size());

    }

}
