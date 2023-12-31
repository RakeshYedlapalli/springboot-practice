package datastructures.practice;

import com.gap.sample.practice.Springboot_practice.runtimebeancreation.MyFactory;
import newpackage.Items;

import java.util.ArrayList;
import java.util.List;

public class MaximizeSumOfKCornerElementsInArray {

    static int maxSum(int arr[], int K, int start, int end, int max_sum) {
        // Base case
        if (K == 0)
            return max_sum;

        // Pick the start index
        int max_sum_start = max_sum + arr[start];

        // Pick the end index
        int max_sum_end = max_sum + arr[end];

        // Recursive function call
        int max = maxSum(arr, K - 1, start + 1, end, max_sum_start);
        int max1 = maxSum(arr, K - 1, start, end - 1, max_sum_end);

//        System.out.println(max + "," + max1);
        // Return the final answer
        return Math.max(max,max1);
    }

    // Function to find the maximized sum
    static void maximizeSum(int arr[], int K, int n) {
        int max_sum = 0;
        int start = 0;
        int end = n - 1;
        System.out.print(maxSum(arr, K, start, end, max_sum));
    }

    // Driver code
    public static void main(String[] args) {
//        int arr[] = {5, 7, 11, 23, 34, 10, 3, 2, 1};
        int arr[] = {8, 4, 4, 8, 12, 3, 2, 9};
        int K = 3;
        int n = arr.length;
        maximizeSum(arr, K, n);

        Items items = new Items("Rakesh","rajesh");
        Items items2 = new Items("Rakesh","rajesh");

        System.out.println(items.equals(items2));


        List<Integer> list = new ArrayList<>();
        boolean s = list.stream().filter(i-> i == 10).anyMatch(i->i==10);
        System.out.println(s);


    }
}
