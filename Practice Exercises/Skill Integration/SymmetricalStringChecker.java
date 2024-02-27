public class SymmetricalStringChecker {
    public static boolean isSymmetricalString(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "radar";
        System.out.println("'" + str + "' is a symmetrical string: " + isSymmetricalString(str));
    }
}
