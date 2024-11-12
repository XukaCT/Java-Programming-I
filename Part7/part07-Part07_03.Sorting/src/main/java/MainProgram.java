import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }  
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int small : array){
            if(smallest >= small){
                smallest = small;
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        int where = 0;
        int smallest = array[0];
        for (int i=0; i < array.length;i++){
            if(smallest >= array[i]){
                smallest = array[i];
                where = i;
            }
        }
        return where;        
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int where = 0;
        for(int i=startIndex;i < array.length;i++){
            if(smallest >= array[i]){
                smallest = array[i];
                where = i;
            }
        }
        return where;
    }
    public static void swap(int[] array, int index1, int index2){
        int middleMan = array[index1];
        array[index1] = array[index2];
        array[index2] = middleMan;
    }
    public static void sort(int[] array){
        for(int i=0; i< array.length;i++){
            swap(array, i, indexOfSmallestFrom(array,i));
            System.out.println(Arrays.toString(array));            
        }
    }
}
