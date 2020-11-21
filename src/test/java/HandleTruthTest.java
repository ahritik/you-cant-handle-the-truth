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
                "I'm blue, da ba dee da ba daa Da ba dee da ba daa, da ba dee da ba daa",
        };


        // First Test Case
        TreeMap<Integer, Set<String>> output1 = new TreeMap<>(Collections.reverseOrder());

        // Second Test Case
        TreeMap<Integer, Set<String>> output2 = new TreeMap<>(Collections.reverseOrder());


        TreeMap[] expected = {output1, output2};

        for(int i = 0; i < testMessages.length; i++){
            Set actual = HandleTruth.wordCount(testMessages[i]);
            assertEquals(actual, expected[i]);
        }
    }

}