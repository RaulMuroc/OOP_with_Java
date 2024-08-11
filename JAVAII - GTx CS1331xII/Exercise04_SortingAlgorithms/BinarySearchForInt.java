package Exercise04_SortingAlgorithms;

import java.util.Random;

public class BinarySearchForInt {

    public static int binarySearch(Integer[] list, int target) {
        int start = 0, end = list.length - 1, mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (list[mid] == (int)target)
                return mid;
            else if ((int)target < list[mid]) 
                end = mid - 1;
            else 
                start = mid + 1;
            }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] numbers = new Integer[1000000];
        //Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            double rand = Math.random() * 1000000;
            numbers[i] = (int)rand;//.nextInt(1000000);
            //System.out.println("the num: " + numbers[i]);
        }
        int theRand = (int)rand;
        int theMid = binarySearch(numbers, theRand);
        System.out.println(theMid);

    }
}
    