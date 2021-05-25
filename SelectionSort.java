//selection sort
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
    	
    	int n = 100000;
    	int[] numbers = createRandomIntArray (n); 
    	
    	long start = System.currentTimeMillis();
    	selectionSort(numbers);
    	double elapsed1 = (System.currentTimeMillis() - start) /
                1000.0;
        System.out.println("selection sort " + elapsed1 
                           + " seconds");
      
        System.out.println();
    	boolean res = isSorted(numbers);
    	System.out.println("Sorted? " + res);

   
    }
    
    //Create a random array of ints 
    public static int[] createRandomIntArray(int size) {
        int[] numbers = new int[size];
        Random rand = new Random();
        int min = rand.nextInt(size);
        int max = rand.nextInt(size - min) + min;
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(size * 2);
        }
        return numbers;
    }
    
    // Return true if array a's elements are in sorted order.
    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]) {
                return false;
            }
        }
        
        return true;
    }

    // Swaps a[i] with a[j].
    public static void swap(int[] a, int i, int j) {
        if (i != j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    
   
    // Places the elements of the given array into sorted order
    // using the selection sort algorithm.
    // post: array is in sorted (nondecreasing) order
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // find index of smallest element
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            
            swap(a, i, smallest);  // swap smallest to front
        }
    }
    
    
    
}
