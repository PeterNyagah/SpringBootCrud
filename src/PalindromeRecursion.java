public class PalindromeRecursion {

    public static void main(String[] arg) {
        String pa = "Madam";
        pa = pa.toLowerCase();
        System.out.println(is_Palindrome(pa));
    }

    private static boolean is_Palindrome(String pa) {

        return is_Palindrome(0, pa.length() - 1, pa);
    }

    private static boolean is_Palindrome(int i, int j, String pa) {

        if (i >= j) {
            return true;
        }

        if (pa.charAt(i) != pa.charAt(j)) {
            return false;
        }

        return is_Palindrome(i + 1, j - 1, pa);
    }
}
