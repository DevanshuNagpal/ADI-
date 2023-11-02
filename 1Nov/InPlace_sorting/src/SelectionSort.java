import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = new int[] {12 ,4 ,56 ,91 ,33 ,18};

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
//            i: position for swap
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
