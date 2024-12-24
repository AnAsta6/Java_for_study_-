import org.junit.Test;
import static org.junit.Assert.*;

public class ValidationTest {

    @Test
    //возраст человека в диапазоне от 1 до 200 корректен
    public void testHumanVValidAge() {
        HumanV human = new HumanV(50);
        assertTrue(HumanTestsV.testValidAge(human));
        assertTrue(HumanTestsV.testAgeRange(human));
    }

    @Test
    // 0 некорректно
    public void testHumanVInvalidAge() {
        HumanV human = new HumanV(0);
        assertFalse(HumanTestsV.testValidAge(human));
        assertFalse(HumanTestsV.testAgeRange(human));
    }

    @Test
    // 250 является корректным, но не в диапазоне от 1 до 200
    public void testHumanVOutOfRangeAge() {
        HumanV human = new HumanV(250);
        assertTrue(HumanTestsV.testValidAge(human));
        assertFalse(HumanTestsV.testAgeRange(human));
    }

    @Test
    //от 1 до 150 корректно
    public void testPersonValidAge() {
        Person person = new Person(50);
        assertTrue(PersonTests.testValidAge(person));
        assertTrue(PersonTests.testAgeRange(person));
    }

//персоны

    @Test
    // 0 некорректно для персоны
    public void testPersonInvalidAge() {
        Person person = new Person(0);
        assertFalse(PersonTests.testValidAge(person));
        assertFalse(PersonTests.testAgeRange(person));
    }

    @Test
    //160 корректно, но не в [1;150]
    public void testPersonOutOfRangeAge() {
        Person person = new Person(160);
        assertTrue(PersonTests.testValidAge(person));
        assertFalse(PersonTests.testAgeRange(person));
    }

    //валидатор убирает исключение для неправильного возраста
    @Test(expected = ValidatorV.ValidationExceptionV.class)
    public void testValidatorVException() throws Exception {
        HumanV human = new HumanV(250);
        ValidatorV.validate(human);
    }

    // тоже самое, но не убирает для правильного
    @Test
    public void testValidatorVNoException() throws Exception {
        HumanV human = new HumanV(50);
        ValidatorV.validate(human);
    }
}
