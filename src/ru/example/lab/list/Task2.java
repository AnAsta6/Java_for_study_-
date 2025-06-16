package ru.example.lab.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс для работы с телефонной книгой.
 * Реализует основные операции: добавление, удаление, поиск контактов.
 */
public class Task2 {
    private final Map<String, String> phoneBook;

    /**
     * Конструктор. Инициализирует пустую телефонную книгу.
     */
    public Task2() {
        phoneBook = new HashMap<>();
    }

    /**
     * Добавляет контакт в телефонную книгу.
     *
     * @param phone номер телефона
     * @param name имя контакта
     * @return предыдущий номер телефона, связанный с этим именем, или null, если имени не было
     */
    public String addContact(String phone, String name) {
        return phoneBook.put(name, phone);
    }

    /**
     * Удаляет контакт из телефонной книги по имени.
     *
     * @param name имя контакта для удаления
     * @return номер телефона удаленного контакта или null, если контакт не найден
     */
    public String removeContact(String name) {
        return phoneBook.remove(name);
    }

    /**
     * Возвращает номер телефона по имени контакта.
     *
     * @param name имя контакта
     * @return номер телефона или null, если контакт не найден
     */
    public String getPhoneByName(String name) {
        return phoneBook.get(name);
    }

    /**
     * Возвращает строковое представление телефонной книги.
     *
     * @return строку в формате "телефон - имя", каждый контакт на новой строке
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            sb.append(entry.getValue()).append(" - ").append(entry.getKey()).append("\n");
        }
        return sb.toString();
    }

    /**
     * Проверяет наличие номера телефона в книге.
     *
     * @param phone номер телефона для проверки
     * @return true если номер присутствует, false в противном случае
     */
    public boolean hasPhone(String phone) {
        return phoneBook.containsValue(phone);
    }

    /**
     * Проверяет наличие имени в книге.
     *
     * @param name имя для проверки
     * @return true если имя присутствует, false в противном случае
     */
    public boolean hasName(String name) {
        return phoneBook.containsKey(name);
    }

    /**
     * Возвращает количество контактов в телефонной книге.
     *
     * @return количество контактов
     */
    public int getContactCount() {
        return phoneBook.size();
    }

    /**
     * Возвращает все пары "телефон - имя" в виде массива строк.
     *
     * @return массив строк в формате "телефон - имя"
     */
    public String[] getAllPairs() {
        String[] pairs = new String[phoneBook.size()];
        int index = 0;
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            pairs[index++] = entry.getValue() + " - " + entry.getKey();
        }
        return pairs;
    }

    /**
     * Возвращает все номера телефонов из книги.
     *
     * @return массив номеров телефонов
     */
    public String[] getAllPhones() {
        return phoneBook.values().toArray(new String[0]);
    }

    /**
     * Возвращает все имена контактов из книги.
     *
     * @return массив имен контактов
     */
    public String[] getAllNames() {
        return phoneBook.keySet().toArray(new String[0]);
    }

    /**
     * Возвращает имена контактов, начинающиеся с заданного префикса.
     *
     * @param prefix префикс для поиска имен
     * @return массив имен, начинающихся с префикса
     */
    public String[] getNamesByPrefix(String prefix) {
        List<String> matchingNames = new ArrayList<>();
        for (String name : phoneBook.keySet()) {
            if (name.startsWith(prefix)) {
                matchingNames.add(name);
            }
        }
        return matchingNames.toArray(new String[0]);
    }
}