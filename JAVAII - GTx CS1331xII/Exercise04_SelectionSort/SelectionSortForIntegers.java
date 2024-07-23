package Exercise04_SelectionSort;

public class SelectionSortForIntegers {

    public static void SelectionSort(int[] list) {
        
        int minIndex;
        int nextSmallest;

        for (int unsortedStart = 0; unsortedStart < list.length-1; unsortedStart++) {
            minIndex = unsortedStart;
            for (int currIndex = unsortedStart+1; currIndex < list.length; currIndex++) {
                if (list[currIndex] < list[minIndex]) {
                    minIndex = currIndex;
                }
            }

            nextSmallest = list[minIndex];
            list[minIndex] = list[unsortedStart];
            list[unsortedStart] = nextSmallest;
        }
        // final check if ordered array is correct
        for (int i : list) {
            System.out.println(" i in ordered: " + i);
        }
    }
    public static void main(String[] args) {
        int[] test = {3,9,6,1,2};
        long start = System.nanoTime(); // performance analysis -- start
        SelectionSort(test);
        long end = System.nanoTime(); // performance analysis -- end
        System.out.println("Elapsed time in ns:" + (end - start));
    }
}
