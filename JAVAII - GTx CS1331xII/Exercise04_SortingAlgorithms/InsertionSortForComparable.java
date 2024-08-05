package Exercise04_SortingAlgorithms;

public class InsertionSortForComparable {

    public static void insertionSort(Comparable[] list) {
        for (Comparable<T> unsortedStart = 1; unsortedStart.compareTo(list.length) < 0; unsortedStart++) {
            Comparable nextInsert = list[unsortedStart];
            int currentIndex = unsortedStart - 1;

            while (currentIndex >= 0 && list[currentIndex].compareTo(nextInsert) > 0) {
                list[currentIndex+1] = list[currentIndex];
                currentIndex--;
            }
            list[currentIndex+1] = nextInsert;
        }
    }
}
