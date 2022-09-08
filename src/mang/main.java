package mang;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10};
        int[] array = new int[arr.length + 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vi tri can thay doi: ");
        int index = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (index > i) {
                array[i] = arr[i];
            } else if (index == i) {
                array[i] = 1000;
            } else {
                array[i] = arr[i - 1];
            }
        }

        System.out.println("mang moi " + Arrays.toString(array));

    }
}

