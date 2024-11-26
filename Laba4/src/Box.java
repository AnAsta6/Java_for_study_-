// Класс для задания 3.1.1

//для 2.3
class Box<T> {
    private T content;

    // Метод для размещения объекта в коробке
    public void put(T item) {
        if (content != null) {
            throw new IllegalStateException("Коробка уже заполнена");
        }
        content = item;
    }

    // Метод для извлечения объекта из коробки
    public T get() {
        if (content == null) {
            throw new IllegalStateException("Коробка пуста");
        }
        T item = content;
        content = null; // Обнуляем ссылку на объект
        return item;
    }

    // Метод для проверки на заполненность
    public boolean isEmpty() {
        return content == null;
    }

    @Override
    public String toString() {
        return "Box{" +
                "content=" + content +
                '}';
    }
}
