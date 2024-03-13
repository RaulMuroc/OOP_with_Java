public class PrimitiveOperations {
    public static void main(String[] args) {
        int firstVar = 3;
        double secondVar = 2.5;
        System.out.println(firstVar);
        System.out.println(secondVar);
        double resultMult = firstVar * secondVar;
        System.out.println(resultMult);
        double castIntToDouble = (double) firstVar;
        System.out.println(castIntToDouble);
        float castDoubleToInt = (int) secondVar;
        System.out.println(castDoubleToInt);
        char ASingleLetter = 'A';
        System.out.println(ASingleLetter);
        System.out.println((char)(ASingleLetter+32));
    }
}
