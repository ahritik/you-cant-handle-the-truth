import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class HandleTruthTest {

    @Test
    public void makeshiftTest() {
        String[] testMessages = {
                "very nice", //first test case
                "now i do what i want now i do what i want yea", //second test case
                "this is my test case example for my test", // third test case
                "ha ha ha hq ho ho ho", // fourth test case
                "i am blue da ba dee da ba daa da ba dee da ba daa da ba dee da ba daa", // fifth and last test case
        };

        // Set to be reused for each of the words
        Set<String> words;

        // First Test Case
        // very nice
        TreeMap<Integer, Set<String>> output1 = new TreeMap<>(Collections.reverseOrder());
        words = new HashSet<>(Arrays.asList("very", "nice"));
        output1.put(1, words);

        // Second Test Case
        // now i do what i want now i do what i want yea
        TreeMap<Integer, Set<String>> output2 = new TreeMap<>(Collections.reverseOrder());
        words = new HashSet<>(Arrays.asList("i"));
        output2.put(4, words);
        words = new HashSet<>(Arrays.asList("what", "want", "now", "do"));
        output2.put(2, words);
        words = new HashSet<>(Arrays.asList("yea"));
        output2.put(1, words);

        // Third Test Case
        // this is my test case example for my test
        TreeMap<Integer, Set<String>> output3 = new TreeMap<>(Collections.reverseOrder());
        words = new HashSet<>(Arrays.asList("test","my"));
        output3.put(2, words);
        words = new HashSet<>(Arrays.asList("this", "is", "for", "example", "case"));
        output3.put(1, words);

        // Fourth Test Case
        // ha ha ha hq ho ho ho
        TreeMap<Integer, Set<String>> output4 = new TreeMap<>(Collections.reverseOrder());
        words = new HashSet<>(Arrays.asList("ha","ho"));
        output4.put(3, words);
        words = new HashSet<>(Arrays.asList("hq"));
        output4.put(1, words);

        // Fifth Test Case
        // i am blue da ba dee da ba daa da ba dee da ba daa da ba dee da ba daa
        TreeMap<Integer, Set<String>> output5 = new TreeMap<>(Collections.reverseOrder());
        words = new HashSet<>(Arrays.asList("da", "ba"));
        output5.put(6, words);
        words = new HashSet<>(Arrays.asList("daa", "dee"));
        output5.put(3, words);
        words = new HashSet<>(Arrays.asList("i", "blue", "am"));
        output5.put(1, words);

        // Expected Output Array made
        TreeMap<Integer, Set<String>>[] expected = new TreeMap[]{output1, output2, output3, output4, output5};

        // Loop through the outputs.
        for(int i = 0; i < testMessages.length; i++){
            // Makes a set
            TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount(testMessages[i]);
            // Checks that the returned set was the same as the one returned
            assertEquals(actual, expected[i]);
            // To separate the output
            System.out.println();
        }
    }

}