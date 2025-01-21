package com.maps;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

//        HashMap:

        Map<String, Double> feeStructure = new LinkedHashMap<>();
        System.out.println(feeStructure.put("Java", 5000.40));
        feeStructure.put("Python", 4000.00);
        feeStructure.put("Spring Boot", 10000D);
        feeStructure.put("Django", 6000.98);
        System.out.println(feeStructure.put("Java", 2000.90));
        System.out.println(feeStructure);
        System.out.println(feeStructure.get("Django"));
        System.out.println(feeStructure.isEmpty());
//        System.out.println(feeStructure.remove("Django"));
//        System.out.println(feeStructure);
        System.out.println(feeStructure.size());
        feeStructure.put("Java", 2000.90);
        System.out.println(feeStructure.containsKey("Java Programming"));
        System.out.println(feeStructure.containsValue(6000.98));

        Set<String> keySet = feeStructure.keySet();

        System.out.println(keySet);

        for (String key : keySet) {
            System.out.println(key + "=>" + feeStructure.get(key));
        }

        System.out.println("+++++++++++++");

        Set<Map.Entry<String, Double>> entries = feeStructure.entrySet();

        Iterator<Map.Entry<String, Double>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + " ===> " + value);
        }


        Map<String, Integer> namesWithAgesMap = Map.of("Ram", 23, "Shyam", 45);

        System.out.println(namesWithAgesMap);

        namesWithAgesMap.put("Durgesh",25);

//

//        Double javaFee = feeStructure.get("Java");
//        System.out.println(javaFee);
//
////        Create Map(Key value pair): LinkedHashMap
//        Map<String, Double> lmap = new HashMap<>(feeStructure);
////        lmap.putAll(feeStructure);
//        System.out.println(lmap);
//
////        TreeMap
//
//        Map<String, Double> tmap = new TreeMap<>(lmap);
////        tmap.putAll(lmap);
//        System.out.println(tmap);


    }
}
