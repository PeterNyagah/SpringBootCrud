public class RemoveVowels {

    public static void main(String[] args) {
        String vo = "The place we all know as home";
        System.out.println(removeVowel(vo));
    }

    public static String removeVowel(String vo) {
        return vo.replaceAll("[aeiouAEIOU]", "");
    }
}
