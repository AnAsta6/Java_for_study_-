
public class PersonTests {
    public static boolean testAgeRange(Person p) {
        int age = p.getAge();
        return age >= 1 && age <= 150;
    }

    public static boolean testValidAge(Person p) {
        return p.getAge() > 0;
    }
}
