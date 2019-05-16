import org.springframework.context.annotation.Conditional;

@Conditional(Matcher.class)
public @interface OnBeanIsPresent {
    public String required() default "person";
}
