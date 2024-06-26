public class removeDuplicateChars {
    public static String removeConsecutiveDuplicateChars(String str) {

        if (str.length() == 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return removeConsecutiveDuplicateChars(str.substring(1, str.length()));
        } else {
            return str.charAt(0) + removeConsecutiveDuplicateChars(str.substring(1, str.length()));

        }

    }

    public static void main(String[] args) {
        String str = "ABBCCEEDDFGGGGGGH";
        System.out.println(removeConsecutiveDuplicateChars(str));
    }
}
