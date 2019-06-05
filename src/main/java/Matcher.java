import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class Matcher implements Condition {
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        BeanInfo info = null;
        try {
            info = Introspector.getBeanInfo(Person.class);
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        PropertyDescriptor[] pds = info.getPropertyDescriptors();
        //pds[1].getReadMethod().invoke()
        return conditionContext.getBeanFactory().containsBeanDefinition("Person");
    }
}
