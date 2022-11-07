import java.util.HashMap;
import java.util.Map;

public class HashMapCharFrequencyCount {

    public static void main(String[] arg) {

        String word = "hippo";

        charFrequency(word);
    }

    private static void charFrequency(String word) {

        char charArray[] = word.toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : charArray) {

            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        System.out.println(charCount);

        for (Map.Entry entry : charCount.entrySet()) {

            System.out.println("Char " + entry.getKey() + " value " + entry.getValue());

        }
    }
}
