public class Examples08 {
    public static boolean endsWithStar(String s) {
        return (!(s.isEmpty()) && s.endsWith("*"));
    }

    public static String changeDate(String dateStr) {
        return "" + dateStr.charAt(3) + dateStr.charAt(4) + "-" + dateStr.charAt(0) + dateStr.charAt(1) + "-"
                + dateStr.charAt(6) + dateStr.charAt(7) + dateStr.charAt(8) + dateStr.charAt(9);
    }

    public static String scroll(String s) {
        return s.substring(0, s.length()) + s.charAt(0);
    }

    public static String cutOut(String s, String s2) {
        // return s.replaceFirst(s2, "");
        return s.substring(0, s.indexOf(s2)) + s.substring(s.indexOf(s2) + s2.length());
    }

    public static boolean onlyDigits(String s) {
        try {
            int num = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    // public static boolean apolloLikes(String s) {
    // }

    public static void main(String[] args) {
        // System.out.println(onlyDigits("1234a"));
        System.out.println(Integer.parseInt("null"));
    }
}