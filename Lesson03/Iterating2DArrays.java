

public class Iterating2DArrays {
    public static void main(String[] args) {
        double[][] array2d_example = new double[2][3];
        array2d_example[1][2] = 74;
        array2d_example[1][0] = 69;
        array2d_example[1][1] = 72;
        array2d_example[0][0] = 80;
        array2d_example[0][1] = 70;
        array2d_example[0][2] = 75;
        for (int col = 0; col < array2d_example[0].length; col++) {
            for (int row = 0; row < array2d_example.length; row++) {
                double current = array2d_example[col][row];
                //if ((array2d[row][col] >= MIN_TEMP) && (array2d[row][col] <= MAX_TEMP)) {
                    System.out.println("value -> " + current);
                //}
            }
        }
    }
}
