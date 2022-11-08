package Arrays_8;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Integer[] arr={5,12,9,19,10,16,14,62};
        //toString
        System.out.println("-----toString-----");
        System.out.println(Arrays.toString(arr));
        //copyOf
        System.out.println("-----copyOf-----");
        Integer[] copy1 = Arrays.copyOf(arr, 9);
        System.out.println(Arrays.toString(copy1));
        //copyOfRange
        System.out.println("-----copyOfRange-----");
        Integer[] copy2 = Arrays.copyOfRange(arr,0,5);
        System.out.println(Arrays.toString(copy2));
        //fill
        System.out.println("-----fill-----");
        //Arrays.fill(arr,100);
        System.out.println(Arrays.toString(arr));
        //sort
        System.out.println("-----sort-----");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //binarySearch
        System.out.println("-----binarySearch-----");
        int i = Arrays.binarySearch(arr, 10);
        System.out.println(i);
    }
}
