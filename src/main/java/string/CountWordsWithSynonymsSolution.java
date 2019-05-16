package string;

import java.util.HashMap;
import java.util.Map;

/*
 * To execute Java, please define "static void main" on a class
 * named CountWordsWithSynonymsSolution.
 *
 * If you need more classes, simply define them inline.
 */

class CountWordsWithSynonymsSolution {
    // input: {warm=2, sizzling=2, cool=1, cold=2, hot=2, day=1, icy=1}
    //warm: sizzling
    // output: {cold=5, hot=6, day=1}
    static String[][] synonyms = {
            {"hot", "warm"},
            {"warm", "sizzling"},
            {"cold", "cool"},
            {"icy", "cold"}};

    public static void main(String[] args) {
        String input = "hot warm Sizzling WARM HOT cold COOL icy cold sizzling day";
        Map<String, Integer> wordMap = countWords(input);
        // print map
        System.out.println(wordMap);
        Map<String, Integer> wordCount = countWordsWithSynonyms(wordMap, synonyms);
        System.out.println(wordCount);
    }

  /*
   * Q2 - Taking the map from Part 1 and the String[][] of synonyms as
   * inputs, return a map of the words and their counts, combining the count
   * of all synonyms for a given word.
   *
   * Synonyms are symmetric and transitive.
   * The final map can contain any one of synonyms.
   */

    /*
     * Q1 - For the given input string, return a map of case insensitive
     * words and their counts. Do not worry about punctuation or special
     * characters.
     */
    public static Map<String, Integer> countWords(String input) {
        if (input == null || input.trim().length() == 0) {
            return null;
        } else {
            String[] strings = input.split(" ");
            Map<String, Integer> mapOfStrings = new HashMap<String, Integer>();

            for (String s : strings) {
                if (mapOfStrings.get(s.toLowerCase()) == null) {
                    mapOfStrings.put(s.toLowerCase(), 1);
                } else {
                    Integer currentCount = mapOfStrings.get(s.toLowerCase());
                    mapOfStrings.put(s.toLowerCase(), currentCount + 1);
                }
            }

            return mapOfStrings;
        }
    }

    public static Map<String, Integer> countWordsWithSynonyms(
            Map<String, Integer> wordMap,
            String[][] synonyms) {
        Map<String, String> synonymsMap = buildSynonmysMap(synonyms);
        System.out.println(synonymsMap);
        Map<String, Integer> resultMap = new HashMap<>();
        for (Map.Entry<String, Integer> e : wordMap.entrySet()) {
            String synonym = synonymsMap.get(e.getKey());
            if (synonym == null) {
                resultMap.put(e.getKey(), e.getValue());
            } else {

                if (resultMap.get(synonym) == null) {
                    resultMap.put(synonym, e.getValue());
                } else {
                    Integer currentSynCount = resultMap.get(synonym);
                    resultMap.put(synonym, e.getValue() + currentSynCount);
                }

            }
        }
        //hot : hot
        //warm : hot
        //sizzling: hot


        return resultMap;
    }

    private static Map<String, String> buildSynonmysMap(String[][] synonyms) {

        Map<String, String> resultMap = new HashMap<>();
        int rows = synonyms.length;
        for (int i = 0; i < rows; i++) {
            int columns = synonyms[i].length;

            for (int j = 0; columns > j; j++) {
                String rowAnyExist = rowAnyExist(synonyms[i], resultMap);
                if (rowAnyExist != null) {
                    resultMap.put(synonyms[i][j], resultMap.get(rowAnyExist));
                } else {
                    resultMap.put(synonyms[i][j], synonyms[i][0]);
                }
            }
        }
        return resultMap;
    }

    private static String rowAnyExist(String[] synonym, Map<String, String> resultMap) {
        int length = synonym.length;
        for (String s :
                synonym) {
            if (resultMap.get(s) != null) {
                return s;
            }
        }
        return null;
    }

}
