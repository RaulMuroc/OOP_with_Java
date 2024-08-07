package Exercise04_SortingAlgorithms;

public class MergeSortForInt {

    // the mergeSort method itself 
    public static int[] mergeSort(int[] list, int start, int end) {
        int[] test2 = {};
        if (start == end) {
            return test2;
        } else if (start == end-1) {
            if (list[start] <= list[end]) {
                return test2;
            } else { // swap
                int temp = list[start];
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
    private static void merge(int[] list, int leftHalfStart, int rightHalfStart, int end) {
        int leftHalfSize = rightHalfStart - leftHalfStart + 1;
        int rightHalfSize = end - rightHalfStart;
    
        int[] leftHalf = new int[leftHalfSize];
        int[] rightHalf = new int[rightHalfSize];
    
        for (int i=0; i<leftHalfSize; ++i)
            leftHalf[i] = list[leftHalfStart + i];
        for (int j=0; j<rightHalfSize; ++j)
            rightHalf[j] = list[rightHalfStart + 1+ j];
    
        int i = 0;
        int j = 0;
    
        int k = leftHalfStart;
        while (i < leftHalfSize && j < rightHalfSize) {
            if (leftHalf[i] <= rightHalf[j]) {
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
        int[] test = {4,6,8,1,2,9};
        int[] result;
        result = mergeSort(test, 0, test.length - 1);
        for (int i : result) {
            System.out.println(" i in ordered: " + i);
        }
    }

}
