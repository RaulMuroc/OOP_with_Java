

public class ArraySearch_with_no_method {
    public static void main(String[] args) {
        String[] concepts = {"abstraction", "polymorphism", "inheritannce", "encapsulation"};
        String result = "not found";
        for (String concept : concepts){
            if (concept.equals("polymorphism")){
                result = "found";
                break;
            }
        }
        System.out.println(result);
    }
}
