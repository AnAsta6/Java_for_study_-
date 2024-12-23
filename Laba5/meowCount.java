
public class meowCount implements Meowable {
    private Meowable meowable;
    private static int meowCount = 0;

    public meowCount(Meowable meowable) {
        this.meowable = meowable;
    }

    @Override
    public void meow() {
        meowable.meow();
        meowCount++;
    }

    public static int getmeowCount() {
        return meowCount;
    }
}
