package task;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task {
    private static Map<String, Integer> random = new HashMap<>();

    public static void main(String[] args) {
        random.put("Petr", 10);
        random.put("Stepan", 30);
        random.put("Nikolay", 129);
        System.out.println(random);
        Task task = new Task();
        task.addInCollection("Petr0", 10);
        System.out.println(random);
        task.addInCollection("Petr", 30);
        System.out.println(random);


    }

    public Map<String, Integer> getMap() {
        return random;
    }

    public void addInCollection(String name, Integer salary) {
        if (name == null || name.isEmpty() || name.isBlank() || salary <= 0) {
            throw new IllegalArgumentException("Некорректный ввод");
        }
        if (!random.containsKey(name)) {
            random.put(name, salary);
        } else {
            boolean result = Objects.equals(random.get(name), salary);
            if (result){
                throw new IllegalArgumentException("Такое значение уже есть");
            }else {
                random.put(name, salary);
            }
        }
    }
}