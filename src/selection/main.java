package selection;

public class main {
    void slSort(int []arr){
     for (int i = 0; i< arr.length-1;i++){
         int min_index = i;
         for (int j = i+1; j< arr.length; j++){
             if (arr[j]<arr[min_index]){
                 min_index = j;
             }
         }
         if (min_index != i) {
             int temp = arr[min_index];
             arr[min_index] = arr[i];
             arr[i] = temp;
         }
     }
    }
    void xuatArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        main main = new main();
        int []arr = {4,7,8,2,3,1,2,9,8,4,2,1,3,1};
        main.slSort(arr);
        main.xuatArray(arr);
    }
}
