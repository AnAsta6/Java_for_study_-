//3.2


public class HumanTestsV {
    public static boolean testAgeRange(HumanV h) {
        int age = h.getAge();
        return age >= 1 && age <= 200;
    }

    public static boolean testValidAge(HumanV h) {
        return h.getAge() > 0;
    }
}

