import org.springframework.context.annotation.Conditional;

import java.util.List;

public interface DataSource {

    List<Person> getPersonDetails();
}
