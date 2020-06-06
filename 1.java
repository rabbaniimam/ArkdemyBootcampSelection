import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner divideAndSort = new Scanner(System.in);
        int[] input = new int[16];


        for (int i = 0; i < input.length; i++) {
            System.out.println("Please enter number");
            input[i] = divideAndSort.nextInt();
        }


        System.out.println("array before sorting");
        System.out.println(Arrays.toString(input));

        mergesort(input);



        System.out.println("array after sorting");
        System.out.println(Arrays.toString(input));

    }

    public static void mergesort(int[] input) {
        mergesort(input, 0, input.length - 1);

        }

    private static void mergesort(int[] input, int start, int end) {
        int mid = (start + end) / 2;
        if (start < end) {
            mergesort(input, start, mid);
            mergesort(input, mid + 1, end);
        }

        int i = 0, first = start, last = mid + 1;
        int[] tmp = new int[end - start + 1];

        while (first <= mid && last <= end) {
            tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
        }
        while (first <= mid) {
            tmp[i++] = input[first++];
        }
        while (last <= end) {
            tmp[i++] = input[last++];
        }
        i = 0;
        while (start <= end) {
            input[start++] = tmp[i++];


        }

    }

}