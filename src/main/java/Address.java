import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Configuration("address")
@OnBeanIsPresent(required = "person")
public class Address {

    private int id;
    private String street;

    public Address(int id, String street) {
        this.id = id;
        this.street = street;
    }
}
