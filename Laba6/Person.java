@Validate(value = {PersonTests.class})
public class Person extends Human {
    public Person(int age) {
        super(age);
    }
}
