public class OverloadingMethods {
    public static boolean searchArray(String target, String[] array) {
        boolean result = false;
        for (String element : array) {
            if ((element != null) && (element.equals(target))) {
                result = true;
                break;
            }
        }
        return result;
    }
        
    public static boolean searchArray(int target, int[] array) {
        boolean result = false;
        for (int element : array) {
            if (element == target) {
                result = true;
                break;
            }
        }
        return result;
    }

    // --> overloading in the return value
        // public static int searchArray(int target, int[] array)
        // public static boolean searchArray(int target, int[] array)

    // --> overloading in the paremeter(s)' types
        // public static boolean searchArray(String target, String[] array)
        // public static boolean searchArray(int target, int[] array)
}