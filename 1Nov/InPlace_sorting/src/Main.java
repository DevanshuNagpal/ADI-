public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

//In Place sorting algorithms
//O(1) space
/*
1. Bubble Sort
    compare two adjacent elements and swap
    12 4 56 91 33 18
     4 12 56 91 33 18
     4 12 56 91 33 18
     4 12 56 91 33 18
     4 12 56 33 91 18
     4 12 56 33 18 91


     Other two algos do sorting left to right but in bubble sort sorting held from right hand side
     In the first part biggest value reaches the end and next tim we do same

    int arr[] = new int[] {12 ,4 ,56 ,91 ,33 ,18};
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length ; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


        TC- O(n^2)


2. Selection Sort
    Divide an array into two parts one is sorted and other side is sorted
    Find the smallest element in the unsorted section

    12 4 56 91 33 18
    compare ist position  to all and smallest will come to first positionand then repeat with 2nd postition an so on

    TC: inner loop runs for n-1 then n-2 so on its complexity will be (n*(n-1))/2
        thus its o(n^2)


3. Insertion sort
    Main use case --- If the array is almost sort otherwise it will work same as bubbnle and selection
    We will be going in every adjacent elements
        but in this case we place the smaller in its sorted position that is it moves all the greater elements from the left to the rightr of th selected element




    Move elements to its sorted position
    12 4 56 91 33 18
    4 12  33 56 91 18



 */