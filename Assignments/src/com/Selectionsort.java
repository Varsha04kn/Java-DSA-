package com;
//pick the smallest and put it in the begining
public class Selectionsort 
{

	    public static void selectionSort(int[] arr) 
	    {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) 
	        {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (arr[j] > arr[minIndex]) 
	                {
	                    minIndex = j;
	                }
	            }

	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    public static void main(String[] args) 
	    {
	        int[] data = {29, 10, 14, 37, 13};
	        selectionSort(data);
	        System.out.println("Sorted Array in Order: ");
	        for (int num : data) 
	        {
	            System.out.print(num + " ");
	        }
	    }
	}