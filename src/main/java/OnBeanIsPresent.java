import org.springframework.context.annotation.Conditional;

@Conditional(Person.class)
public @interface OnBeanIsPresent {
    public String required() default "person";
}
