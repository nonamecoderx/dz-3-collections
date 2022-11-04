package homework21_22;

import java.util.*;

public class task3 {
    final Map<Integer, String> map = new LinkedHashMap<>();
    public static void main(String[] args) {
        HashMap<String, List<Integer>> hashMap = new HashMap<>();
        HashMap<String, Integer> listHashMaps = new HashMap<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<>());
            list.get(i).add((int) (Math.random() * 1000));
            list.get(i).add((int) (Math.random() * 1000));
            list.get(i).add((int) (Math.random() * 1000));
            hashMap.put("string" + i, list.get(i));
            System.out.println("string" + i + "->" + list.get(i));
            listHashMaps.put("string" + i, list.get(i).get(0) + list.get(i).get(1) + list.get(i).get(2));
        }
        System.out.println(listHashMaps);

        //задание 2
        task3 task2 = new task3();
        task2.printInfo();
    }
    public void printInfo() {
        map.put(23, "name1");
        map.put(22, "name2");
        map.put(33, "name3");
        map.put(44, "name4");
        map.put(55, "name5");
        map.put(37, "name6");
        map.put(78, "name7");
        map.put(38, "name8");
        map.put(91, "name9");
        map.put(20, "name10");
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " : " + integerStringEntry.getValue());
        }
    }
}
