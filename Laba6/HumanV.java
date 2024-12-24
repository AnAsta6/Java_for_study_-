//3.2

@Validate(value = {HumanTestsV.class})
class HumanV {
    private int age;

    public HumanV(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Возраст человека = " + age;
    }
}
