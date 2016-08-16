package collection.map;

import java.util.*;

/**
 * Created by 212550544 on 8/2/16.
 * Sorting Map on key and value
 */
public class HashMapSort {

    public static void main(String[] args) {
        Map<String,String> unsortedMap= new HashMap<>();
        unsortedMap.put("Polo","Freshner");
        unsortedMap.put("Mortin","Toffee");
        unsortedMap.put("Cadburry","Chocolates");
        unsortedMap.put("DairyMilk","Dairy");

        System.out.println("Unsorted Map::"+unsortedMap);

        Map<String,String> sortedKeyTreeMap=new TreeMap<>();

        for(Map.Entry<String,String> entry:unsortedMap.entrySet()){
            sortedKeyTreeMap.put(entry.getKey(),entry.getValue());

        }

        System.out.println("Sorted Key Tree Map:: "+ sortedKeyTreeMap);

        Comparator<Map.Entry<String,String>> valueComparator=new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                String v1 = o1.getValue();
                String v2 = o2.getValue();
                return v1.compareTo(v2);
            }
        };

        List<Map.Entry<String,String>> listOfEntries=new ArrayList<>(unsortedMap.entrySet());
        Collections.sort(listOfEntries,valueComparator);
        Map<String,String> sortedValueMap=new LinkedHashMap<>();


        for(Map.Entry<String,String> entry:listOfEntries){
            sortedValueMap.put(entry.getKey(),entry.getValue());

        }

        System.out.println("Sorted Value Tree Map:: "+ sortedValueMap);
    }
}
