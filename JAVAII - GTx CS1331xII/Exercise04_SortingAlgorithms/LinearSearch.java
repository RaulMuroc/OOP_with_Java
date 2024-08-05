package Exercise04_SortingAlgorithms;

import java.util.Random;

public class LinearSearch {

    public static int linearSearch(Comparable target, Comparable[] list) {
        int index = 0;
        while (index < list.length) {
            if (list[index].compareTo(target) == 0)
                return index;
            else
                index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] numbers = new Integer[1000000];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }
        System.err.println("linear search result: " + linearSearch(99999, numbers));
    }
}
