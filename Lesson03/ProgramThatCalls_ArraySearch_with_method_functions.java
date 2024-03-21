public class ProgramThatCalls_ArraySearch_with_method_functions {
    public static void main(String[] args) {
        String[] lullabies = {"Wheels on the bus", "twinkle, twinkle little start", "amazing grace"};
        System.out.println(ArraySearch_with_method.searchStringArray("amazing grace", lullabies));
        System.out.println(ArraySearch_with_method.searchStringArray("dsfsdf grace", lullabies));
        int[] weekHighs = {80, 70, 75, 69, 72, 74, 90};
        System.out.println(ArraySearch_with_method.searchIntArray(90, weekHighs));
    }
}