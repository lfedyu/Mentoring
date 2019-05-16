import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        loadContextAndVerifyBeans(Person.class, Address.class);
        loadContextAndVerifyBeans(Address.class);
        loadContextAndVerifyBeans(Address.class, Person.class);
    }

    private static void loadContextAndVerifyBeans(Class...classToRegister) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        try {
            ctx.register(classToRegister);
            //ctx.refresh();
            System.out.println("Has person? " + ctx.containsBean("person"));
            System.out.println("Has address? " + ctx.containsBean("address"));
        } finally {
            ctx.close();
        }
    }
}
