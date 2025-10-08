package com;
import java.util.Arrays;
public class Sorthalf 
{
    public static void main(String[] args) 
    {
        int[] numbers = {12, 11, 13, 5, 6, 9, 4, 7};
        int n = numbers.length;

        // Calculate the midpoint.
        // For an array of even length, this is arr.length / 2.
        // For an array of odd length, it's (arr.length + 1) / 2 to include the middle element.
        int mid = n / 2;

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the first half of the array.
        // The range is from index 0 (inclusive) to mid (exclusive).
        Arrays.sort(numbers, 0, mid);

        System.out.println("Array after sorting the first half: " + Arrays.toString(numbers));
    }
}



