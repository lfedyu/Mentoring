import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    String myBean (){
        return "Beeean";
    }


}