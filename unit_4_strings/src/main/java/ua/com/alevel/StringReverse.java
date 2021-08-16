package ua.com.alevel;


public class StringReverse {

    public static String reverse(String src) {
        StringBuilder reverse = new StringBuilder();
        for (int i = src.length() - 1; i >= 0; i--)
            reverse.append(src.charAt(i));
        return reverse.toString();
    }

    public static String reverseAll(String src, boolean reverseAll) {
        StringBuilder result = new StringBuilder();
        if (reverseAll) {
            for (String word : src.split(" ")) {
                result.append(reverse(word)).append(" ");
            }
            return result.toString();
        }
        return reverse(src);
    }

    public static String reverseSubstring(String src, String dest) {
        int start = src.indexOf(dest);
        int end = start + dest.length();
        return reverseWithIndex(src, start, end);
    }

    public static String reverseWithIndex(String src, int firstIndex, int lastIndex) {
        String str = src.substring(0, firstIndex);
        String firstInd = src.substring(firstIndex, lastIndex);
        String secondInd = src.substring(lastIndex);
        return str + StringReverse.reverse(firstInd) + secondInd;
    }
}
