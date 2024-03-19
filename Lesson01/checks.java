package Lesson01;

public class checks 
{
    public static void main (String[] args)
    {
        String myStr = "Hello my friend";
        char charFound = myStr.charAt(2);
        int charIndex = myStr.indexOf("friend");
        System.out.println(charFound + " " + charIndex);
    }
}