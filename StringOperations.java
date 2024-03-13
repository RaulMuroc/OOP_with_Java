public class StringOperations {
    public static void main(String[] args) {
        String MyName = new String("Raul");
        System.out.println(MyName);
        String NewName = MyName.replace(MyName.charAt(0),'A').replace(MyName.charAt(MyName.length() - 1),'Z');
        System.out.println(NewName);
        String newUrl = new String("www.24ur.si");
        System.out.println(newUrl);
        System.out.println(newUrl.split("\\.")[1]);
    }
}
