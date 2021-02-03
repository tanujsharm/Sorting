package sorting;

public class BubbleSort
{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        BubbleSort sort = new BubbleSort();
        int arr[] = {34,27,87,13,9,12,87,94,37,55};
        System.out.println("Array before applying Bubble Sort: ");
        sort.printArray(arr);;
        sort.bubbleSort(arr);
        System.out.println("Array after applying Bubble Sort: ");
        sort.printArray(arr);
    }
}