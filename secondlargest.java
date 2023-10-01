import java.util.*;
class solution{
static void print2largest(int arr[],int arr_size)
{
int i, first, second;
if (arr_size < 2)
{
	System.out.printf(" Invalid Input ");
	return;
}
Arrays.sort(arr);
for (i = arr_size - 2; i >= 0; i--)
{
	if (arr[i] != arr[arr_size - 1])
	{
	System.out.printf("The second largest " +
						"element is %d\n", arr[i]);
	return;
	}
}

System.out.printf("There is no second " +
					"largest element\n");
}
public static void main(String[] args)
{
int arr[] = {12, 23, ,18,11, 10, 3,99,15};
int n = arr.length;
print2largest(arr, n);
}
}
//optimize solution using two pointers
import java.io.*;
class solution{
static void print2largest(int arr[], int arr_size)
{
	int i, first, second;
	if (arr_size < 2)
	{
		System.out.printf(" Invalid Input ");
		return;
	}

	int largest = second = Integer.MIN_VALUE;
	for(i = 0; i < arr_size; i++)
	{
		largest = Math.max(largest, arr[i]);
	}

	// Find the second largest element
	for(i = 0; i < arr_size; i++)
	{
		if (arr[i] != largest)
			second = Math.max(second, arr[i]);
	}
	if (second == Integer.MIN_VALUE)
		System.out.printf("There is no second " +
						"largest element\n");
	else
		System.out.printf("The second largest " +
						"element is %d\n", second);
}
public static void main(String[] args)
{
	int arr[] = {12, 23, ,18,11, 10, 3,99,15 };
	int n = arr.length;
	
	print2largest(arr, n);
}
}
