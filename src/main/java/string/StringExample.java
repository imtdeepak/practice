package string;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by 212550544 on 7/14/16.
 */
public class StringExample {

    public static void main(String[] args) {

        System.out.println("String split example");
        String bigString="This,is,my ,   , alpha, test, This,is,my ,   , beta, test";
        String[] splittedString=bigString.split(",");
        Map<String,Integer> mapCount=new TreeMap<String,Integer>();
        for(String part:splittedString){
            if(!part.trim().isEmpty()) {
                System.out.println(part.trim());
                Integer tempCount = mapCount.get(part.trim());
                if (tempCount != null) {
                    mapCount.put(part.trim(), tempCount + 1);
                } else {
                    mapCount.put(part.trim(), 1);
                }
            }
        }
        for(Map.Entry<String,Integer> entry: mapCount.entrySet()){
            System.out.println("Count of word "+entry.getKey()+" = "+entry.getValue());

        }

    }
}
