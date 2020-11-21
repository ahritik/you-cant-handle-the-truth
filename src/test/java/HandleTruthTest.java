import org.junit.Test;
import org.junit.Assert.*;
import java.util.*;
import static org.junit.Assert.*;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        String[] testMessages = {
                "",
                " ",
                "this is my test case example for my test",
                null,
                "ha ha ha hq ho ho ho",
                "I am blue da ba dee da ba daa Da ba dee da ba daa da ba dee da ba daa",
        };

        Set<String> words;

        // First Test Case
        TreeMap<Integer, Set<String>> output1 = new TreeMap<>(Collections.reverseOrder());

        // Second Test Case
        TreeMap<Integer, Set<String>> output2 = new TreeMap<>(Collections.reverseOrder());

        // Third Test Case
        TreeMap<Integer, Set<String>> output3 = new TreeMap<>(Collections.reverseOrder());

        // Fourth Test Case
        TreeMap<Integer, Set<String>> output4 = new TreeMap<>(Collections.reverseOrder());
        words = new HashSet<>(Arrays.asList("ha"," ho"));
        output4.put(3, words);
        words = new HashSet<>(Arrays.asList("hq"));
        output4.put(1, words);

        //Fifth Test Case
        TreeMap<Integer, Set<String>> output5 = new TreeMap<>(Collections.reverseOrder());



        TreeMap[] expected = {output1, output2, output3, output4, output5};

        for(int i = 0; i < testMessages.length; i++){
            TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount(testMessages[i]);
            assertEquals(actual, expected[i]);
        }
    }

}