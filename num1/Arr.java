package ru.hw.num1;

public class Arr {

    static int[] arr = {1,2,5,6};

    public static void swap(int one, int two){
        int saveP = arr[one];
        arr[one] = arr [two];
        arr[two] = saveP;
    }

    public static void visual(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    // Реализация в 1го задания в этом классе
}
