package wstack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class wStack {
    Scanner scanner = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    private int []arr = new int[10];
    public wStack() {
    }

    void inPut(){
        int[]array = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu " + i + ":" );
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        arr = array;
        System.out.println(Arrays.toString(arr));

    }
    void inPutStack(){
        int[]array = arr;
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
    }
    void reVerse(){
        int i=0;
        int[]array = new int[arr.length];
        while (true){
            if (stack.size()==0){
                break;
            }else {
                array[i] = stack.peek();
                stack.pop();
                i++;
            }
        }
        arr =array;
        System.out.println(Arrays.toString(arr));

    }
}
