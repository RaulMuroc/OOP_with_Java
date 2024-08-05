package Exercise04_SortingAlgorithms;

public class MergeSortForComparable {

    // the mergeSort method itself 
    public static Comparable[] mergeSort(Comparable[] list, int start, int end) {
        Comparable[] test2 = {};
        if (start == end) {
            return test2;
        } else if (start == end-1) {
            if (list[start].compareTo(list[end]) <= 0) {
                return test2;
            } else { // swap
                Comparable temp = list[start];
                list[start] = list[end];
                list[end] = temp;
            }
        }
        
        int mid = (end-start)/2;
        mergeSort(list, start, start + mid);
        mergeSort(list, start + mid + 1, end);
        merge(list, start, start + mid, end);
        return list;
    }   
    
    // a helper method that represents the incremental (and repeated) process of merging two sublists
    private static void merge(Comparable[] list, int leftHalfStart, int rightHalfStart, int end) {
        int leftHalfSize = rightHalfStart - leftHalfStart + 1;
        int rightHalfSize = end - rightHalfStart;
    
        Comparable[] leftHalf = new Comparable[leftHalfSize];
        Comparable[] rightHalf = new Comparable[rightHalfSize];
    
        for (int i=0; i<leftHalfSize; ++i)
            leftHalf[i] = list[leftHalfStart + i];
        for (int j=0; j<rightHalfSize; ++j)
            rightHalf[j] = list[rightHalfStart + 1+ j];
    
        int i = 0;
        int j = 0;
    
        int k = leftHalfStart;
        while (i < leftHalfSize && j < rightHalfSize) {
            if (leftHalf[i].compareTo(rightHalf[j]) < 0) {
                list[k] = leftHalf[i];
                i++;
            } else {
                list[k] = rightHalf[j];
                j++;
            }
            k++;
        }
    
        while (i < leftHalfSize) {
            list[k] = leftHalf[i];
            i++;
            k++;
        }
    
        while (j < rightHalfSize) {
            list[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Comparable[] test = new Comparable[]{3,6,8,1,2,9};
        Comparable[] result;
        result = mergeSort(test, 0, test.length - 1);
        for (Comparable i : result) {
            System.out.println(" i in ordered: " + i);
        }
    }

}
