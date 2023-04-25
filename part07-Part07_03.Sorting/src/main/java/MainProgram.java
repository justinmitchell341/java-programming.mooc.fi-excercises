
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
       int array[] = {4, 3, 2, 1};
        sort(array);
    }
    
    public static int smallest(int[] array){
        int small = array[0];
        for(int i = 0; i < array.length; i++){
                if(small > array[i]){
                    small = array[i];
                }
            }
            return small;
        }
    public static int indexOfSmallest(int[] array){
                int index = 0;
                int small = array[0];
        for(int i = 0; i < array.length; i++){
                if(small > array[i]){
                    small = array[i];
                    index = i;
                }
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        int small = array[startIndex];
        int index = startIndex;
        for(int i = startIndex; i < array.length; i++){
            if(small > array[i]){
                small = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2){
        int temp = 0;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void sort(int[] array){
        int smallest = array[0];
        for(int i = 0; i < array.length; i++){
        System.out.println(Arrays.toString(array));
            for(int y = i; y < array.length - 1; y++){
               smallest = indexOfSmallestFrom(array, y);
               swap(array, y, smallest);
            }
        }
    }
}