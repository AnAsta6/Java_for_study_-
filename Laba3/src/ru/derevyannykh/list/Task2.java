package ru.derevyannykh.list;


import java.util.*;

public class Task2 {
    private Map<String, String> phoneBook;

    // Конструктор инициализации
    public Task2() {
        phoneBook = new HashMap<>();
    }

    // Добавление новой пары "телефон - имя"
    public String addContact(String phone, String name) {
        return phoneBook.put(name, phone); // Возвращает старый телефон, если имя уже существует
    }

    // Удаление значения по имени
    public String removeContact(String name) {
        return phoneBook.remove(name); // Удаляет пару и возвращает телефон
    }

    // Получение телефона по имени
    public String getPhoneByName(String name) {
        return phoneBook.get(name); // Возвращает телефон по имени
    }

    // Приведение к строке
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            sb.append(entry.getValue()).append(" - ").append(entry.getKey()).append("\n");
        }
        return sb.toString();
    }

    // Проверка наличия телефона
    public boolean hasPhone(String phone) {
        return phoneBook.containsValue(phone);
    }

    // Проверка наличия имени
    public boolean hasName(String name) {
        return phoneBook.containsKey(name);
    }

    // Получение текущего количества контактов
    public int getContactCount() {
        return phoneBook.size();
    }

    // Получение всех пар
    public String[] getAllPairs() {
        String[] pairs = new String[phoneBook.size()];
        int index = 0;
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            pairs[index++] = entry.getValue() + " - " + entry.getKey();
        }
        return pairs;
    }

    // Получение всех телефонов
    public String[] getAllPhones() {
        return phoneBook.values().toArray(new String[0]);
    }

    // Получение всех имен
    public String[] getAllNames() {
        return phoneBook.keySet().toArray(new String[0]);
    }

    // Получение имен по части названия
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