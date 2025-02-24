package com.example.project.Binary_Search;

public class BinarySearch {
    // implements binary search on the elements list for target,
    // and returns the index at which the target is found, or -1 if
    public static int binarySearch(int[] elements, int target) {
        // int loopCounter = 0; // for testing
        // int leftIdx =    // TODO: assign this initial value
        // int rightIdx =   // TODO: assign this initial value

        // while (    ) {  // TODO: determine this condition (hint: see slides 61-63)
        //     loopCounter++; // for testing
        //     System.out.print(loopCounter + " "); // for testing
        //     int middleIdx =   // TODO: determine what this should be

        //     // TODO: write the rest of the code to compare middleIdx to the target
        //     //  and adjust leftIdx and rightIdx as appropriate (see slides if needed
        int leftIdx = 0;
        int rightIdx = elements.length - 1;
        while(rightIdx - leftIdx > 2) {
            if(elements[(rightIdx + leftIdx) / 2] > target) {
                rightIdx = (rightIdx + leftIdx) / 2 - 1;
            }
            else if(elements[(rightIdx + leftIdx) / 2 ] < target) {
                leftIdx = (rightIdx + leftIdx) / 2 + 1;
            }
            else {
                return (rightIdx + leftIdx) / 2;
            }
        }
        if(elements.length > 0 && elements[leftIdx] == target) {
            return leftIdx;
        } 
        if(elements.length > 0 && elements[rightIdx] == target) {
            return rightIdx;
        } 

        // }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] test = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(test, 0));
    }
}
