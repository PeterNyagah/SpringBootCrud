public class ReverseString {

    public static void main(String arg[]) {

        reverseString("Geeks");
    }

    private static void reverseString(String input) {

        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);
    }
}
