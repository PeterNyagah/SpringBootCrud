public class ReverseStringSpecial {


    public static void main(String[] arg) {

        String word = "a!dbb&t";

        char charArray[] = word.toCharArray();
        System.out.println(word);
        reverseString(charArray);
        System.out.println(charArray);
    }

    private static void reverseString(char charArray[]) {

        int l = 0;
        int r = charArray.length - 1;

        if (!Character.isAlphabetic(charArray[l])) {
            l++;
        } else if (!Character.isAlphabetic(charArray[r])) {
            r--;
        } else {
            char temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;
            l++;
            r--;
        }

    }
}
