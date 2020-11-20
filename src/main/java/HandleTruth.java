import java.util.*;

public class HandleTruth {
    public static Set wordCount(String msg) {

        // split the message into word set
        String[] words = msg.split(" ");

        // use map to count the occurrences of each word
        HashMap<String, Integer> wordMap = new HashMap<>();

        // Make sure that the input is valid
        if(msg == null || msg.length() == 0)
            return wordMap.entrySet();

        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
                continue;
            }
            wordMap.put(word, 1);
        }
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry);
        }

        // sort the map based on number of occurrences
        TreeMap<Integer, Set<String>> sortedMap = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            int key = entry.getValue();
            Set<String> values = sortedMap.containsKey(key) ?
                    sortedMap.get(key) : new HashSet<>();
            values.add(entry.getKey());
            sortedMap.put(entry.getValue(), values);
        }

        for (Map.Entry<Integer, Set<String>> entry : sortedMap.entrySet()) {
            System.out.println(entry);
        }
        return sortedMap.entrySet();
    }
}