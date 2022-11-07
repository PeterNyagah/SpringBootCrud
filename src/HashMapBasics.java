import java.util.HashMap;
import java.util.Map;


public class HashMapBasics {

    public static void main(String[] arg) {

        HashMap<String, Integer> store = new HashMap<>();

        store.put("abc", 1);
        store.put("abd", 2);
        store.put("abe", 3);
        store.put("abf", 4);

        System.out.println(store);
        System.out.println(store.size());

        if (store.containsKey("abc")) {
            int a = store.get("abc");
            System.out.println("abc => " + String.valueOf(a));
//            store.clear();
            print(store);
        }
    }

    public static void print(Map<String, Integer> store) {

        if (store.isEmpty()) {
            System.out.println("Map is empty");
        } else {
            System.out.println(store);
        }
    }

}