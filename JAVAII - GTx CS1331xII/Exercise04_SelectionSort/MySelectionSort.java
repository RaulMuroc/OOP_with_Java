package Exercise04_SelectionSort;

public class MySelectionSort {

    public static void main(String[] args) {
        //int[] unorderedList = {3, 9, 6, 1, 2};
        int[] unorderedList = {3, 9, 6, 1, 7, 2, 20, 18, 16, 4};
        int minIndex = 0;
        int smallestFound = unorderedList[0];
        int currIndex = 0;
        int startingIndex = 0;
        int lengthArray = unorderedList.length - 1;
        while (startingIndex != lengthArray) {
            System.out.println("starting INDEX Observation: " + startingIndex);
            currIndex = startingIndex;
            for (int i : unorderedList) {
                if (currIndex != lengthArray) { // we reached the end of the array
                    int currValue = unorderedList[currIndex];
                    if (currValue > unorderedList[currIndex + 1] && currValue < smallestFound) {
                        smallestFound = unorderedList[currIndex + 1];
                        minIndex = currIndex + 1;
                    }else {
                        smallestFound = currValue;
                    }
                    currIndex += 1;
                }
            }    
            // swap values
            int mindIndexValue = unorderedList[minIndex];
            unorderedList[minIndex] = unorderedList[startingIndex];
            unorderedList[startingIndex] = mindIndexValue;
            startingIndex += 1;
        }   
        // final check if ordered array is correct
        for (int i : unorderedList) {
            System.out.println(" i in ordered: " + i);
        }
    }
}
