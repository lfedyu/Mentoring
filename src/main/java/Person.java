import javax.validation.constraints.Null;

public class Person {


    private int id;
    @IsStringContains(text="sometext")
    private String name;
    private int age;

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
