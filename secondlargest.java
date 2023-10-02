import java.util.*;

class Solution {
    static void print2largest(int arr[], int arr_size) {
        if (arr_size < 2) {
            System.out.println("Invalid Input");
            return;
        }

        int first, second;
        first = second = Integer.MIN_VALUE;

        for (int i = 0; i < arr_size; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element");
        } else {
            System.out.println("The second largest element is " + second);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 23, 18, 11, 10, 3, 99, 15};
        int n = arr.length;
        print2largest(arr, n);
    }
}
