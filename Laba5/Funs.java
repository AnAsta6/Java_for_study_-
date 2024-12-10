// задание 2

public class Funs {
    public static void meowsCare(Meowable... meowables) {
        for (Meowable meowable : meowables) {
            meowable.meow();
        }
    }
}
