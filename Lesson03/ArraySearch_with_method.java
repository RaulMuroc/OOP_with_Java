public class ArraySearch_with_method {
    public static void main(String[] args) {
        String[] concepts = {"abstraction", "polymorphism", "inheritannce", "encapsulation"};
        // Extracted to the method below 'searchStringArray()'. 
        //      Method is public so will be called from 'SomeOtherProgram' class just for showing purposes.
        // String result = "not found";  
        // for (String concept : concepts){
        //     if (concept.equals("polymorphism")){
        //         result = "found";
        //         break;
        //     }
        // }
        String result = searchStringArray("polymorphism", concepts);
        System.out.println(result);
        
    }

    public static String searchStringArray(String target, String[] array){
        String result = "not found";
        for (String element : array) {
            if (element.equals(target)) {
                result = "found";
                break;
            }
        }
        return result;
    }
    public static boolean searchIntArray(int target, int[] array) {
        boolean result = false;
        for (int element : array) {
            if (element == target) {
                result = true;
                break;
            }
        }
        return result;
    }
}
