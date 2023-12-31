public class Examples08 {
    public static boolean endsWithStar(String s) {
        return (s.length() >= 2 && s.endsWith("**"));
    }

    public static String ss(String s) {
        return "" + s.charAt(0) + s.charAt(1) + s.charAt(2) + s.charAt(4) + s.charAt(5) + s.charAt(7) + s.charAt(8)
                + s.charAt(9) + s.charAt(10);
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

    public static boolean apolloLikes(String s) {
        char last = ' ';
        s = s.trim();
        s = s.toUpperCase();
        char current = ' ';
        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (last == current) {
                return true;
            }
            last = current;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(ss("987-65-4567"));
    }
}