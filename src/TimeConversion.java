public class TimeConversion {

    public static void main(String[] arg) {
        String s1 = "07:01:00AM";
        String s = "06:01:00AM";
        System.out.println(timeConversion(s));
    }

    private static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        String timeOfDay = s.substring(8, 10);

        if (timeOfDay.equals("AM")) {
            if (hour == 12)
                hour = 0;
        } else if (timeOfDay.equals("PM")) {
            if (hour != 12)
                hour += 12;
        }

        return String.format("%02d%s", hour, s.substring(2, 8));
    }

    public static long flippingBits(long n) {
        //Using ~ that is unary bitwise complement = just flip bits
        long unsignedNumber = ~n;
        //Using Bitwise AND 0xffffffffL to mask off those bits and
        //convert signed int to unsigned
        return unsignedNumber & 0xffffffffL;
    }
}
