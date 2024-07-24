package Exercise04_SelectionSort;

public class SelectionSortForComparable {

    public static void SelectionSort(Comparable[] list) {
        
        int minIndex;
        Comparable nextSmallest;

        for (int unsortedStart = 0; unsortedStart < list.length-1; unsortedStart++) {
            minIndex = unsortedStart;
            for (int currIndex = unsortedStart+1; currIndex < list.length; currIndex++) {
                if (list[currIndex].compareTo(list[minIndex]) < 0) {
                    minIndex = currIndex;
                }
            }
            if (minIndex != unsortedStart) {
                nextSmallest = list[minIndex];
                list[minIndex] = list[unsortedStart];
                list[unsortedStart] = nextSmallest;
            }
        }
        // final check if ordered array is correct
        for (Comparable i : list) {
            System.out.println(" i in ordered: " + i);
        }
    }
    public static void main(String[] args) {
        //int[] test = {3,9,6,1,2};
        Comparable[] test = new Comparable[]{3,0,6,1,2};
        SelectionSort(test);
    }
}
